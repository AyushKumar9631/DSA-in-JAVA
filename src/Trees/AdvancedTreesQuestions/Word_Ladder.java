package Trees.AdvancedTreesQuestions;

//leetcode question no.127
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Word_Ladder {
    int n;
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<String> que1= new LinkedList<>();
        int result=2;
        n=beginWord.length();
        que1.add(beginWord);
        while(!que1.isEmpty()){
            Queue<String> que2= new LinkedList<>();
            while(!que1.isEmpty()){
                String s=que1.poll();
                for(int i=0; i<wordList.size(); i++){
                    String temp=wordList.get(i);
                    if(canbe(s,temp)){
                        if(temp.equals(endWord)) return result;
                        que2.offer(temp);
                        wordList.remove(i);
                        i--;
                    }
                }
            }
            result++;
            que1=que2;
        }
        return 0;
    }

    public boolean canbe(String s1, String s2){
        boolean already=false;
        for(int i=0; i<n; i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                if(already) return false;
                already=true;
            }
        }
        return true;
    }
}

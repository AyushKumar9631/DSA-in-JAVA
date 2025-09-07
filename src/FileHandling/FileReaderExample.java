package FileHandling;


import java.io.*;
import java.util.Scanner;

class FileReaderExample{
    public static void main(String[] args) {
        //read return integer -> ASCII value of each character
        try(FileReader fr= new FileReader("C:/Users/ayush kumar/Desktop/Pooja study center/DSA in JAVA/src/FileHandling/text.txt")){
            int letters= fr.read();
            while(fr.ready()){
                System.out.print((char)letters);
                letters= fr.read();
            }
            System.out.println((char) letters);

            //reading via buffered reader more efficient
            BufferedReader apple= new BufferedReader(new FileReader("C:/Users/ayush kumar/Desktop/Pooja study center/DSA in JAVA/src/FileHandling/text.txt"));
            //as system.in is byte stream i cant directly passed to buffered reader
            BufferedReader ball= new BufferedReader(new InputStreamReader(System.in));
            System.out.println(apple.readLine());
//            System.out.println(ball.readLine());

            //reading from scanner class takes file as input
            Scanner sc= new Scanner(new File("C:/Users/ayush kumar/Desktop/Pooja study center/DSA in JAVA/src/FileHandling/text.txt"));
            while(sc.hasNext()){
                System.out.println(sc.next());
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }


}

package FileHandling;

import java.io.*;

public class FileWriterExamples {
    public static void main(String[] args) {
        try{
            System.out.println();
            OutputStreamWriter osw= new OutputStreamWriter(System.out);
            osw.write("Hello world");
            osw.write(98);
            osw.write(98);
            osw.write(99);
        }catch(IOException e){
            System.out.println(e.getMessage());
        }

        try{
            //file writer
            FileWriter writer= new FileWriter("C:/Users/ayush kumar/Desktop/Pooja study center/DSA in JAVA/src/FileHandling/writers.txt");
            String s="Hii! This would be written in file if my program works.\n";
            writer.write(s);
            writer.write("This particular line is written using FileWriter\n\n\n");
            writer.flush();

            //printwriter
            PrintWriter apple=new PrintWriter(new FileWriter("C:/Users/ayush kumar/Desktop/Pooja study center/DSA in JAVA/src/FileHandling/writers.txt", true));
            apple.println("This Paragraph is written using PrintWriter class");
            apple.println("It takes printWriter as input in constructor and has print and println functions");
            apple.println();
            apple.println();
            apple.flush();

            //bufferedwriter
            BufferedWriter ball= new BufferedWriter(new FileWriter("C:/Users/ayush kumar/Desktop/Pooja study center/DSA in JAVA/src/FileHandling/writers.txt" ,true));
            ball.write("This para is written via BufferedReader class");
            ball.newLine();
            ball.write("This class also provides extra methods but i will be using PrintWriter more");
            ball.newLine();
            ball.flush();

        }catch(IOException e){
            System.out.println(e.getMessage());
        }


    }
}

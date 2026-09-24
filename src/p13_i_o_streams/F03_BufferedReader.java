package p13_i_o_streams;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class F03_BufferedReader {
    public static void main (String[] args){
        // BufferedReader lets you read text line by line with readLine()
        try(FileReader file = new FileReader("Shawon.txt");
            BufferedReader br = new BufferedReader(file)){
            String line;
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }
        }
        catch (IOException e){
            System.out.println("An error occurs.");
            e.printStackTrace();
        }
    }
}

// Scanner --> best for simple text. It can split text into lines, words, or numbers (e.g., nextInt(), nextLine()).
// BufferedReader --> best for large text files. It is faster, uses less memory, and can read full lines with readLine().
// FileInputStream --> best for binary files (like images, PDFs, or audio)
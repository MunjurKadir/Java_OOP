package p13_i_o_streams;

import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class F04_BufferedWriter {
    public static void main (String[] args){
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("Shawon.txt", true))){
            bw.write("I am Learning Java");
            bw.newLine();
            bw.write("Java is fun.");
            System.out.println("Successfully wrote to the file.");
        }
        catch (IOException e){
            System.out.println("An error occurs!");
            e.printStackTrace();
        }
    }
}

// FileWriter - best for simple text writing. Quick and easy to use.
// BufferedWriter - better for larger text files, because it is faster and lets you easily add line breaks with newLine().
// FileOutputStream - best for binary files (like images, PDFs, or audio)
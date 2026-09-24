package p13_i_o_streams;

import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class F02_FileOutputStream {
    public static void main (String[] args){
        String text = "\nHello World!"; // The text we want to write

        // try-with-resources: stream will be closed automatically
        try (FileOutputStream output = new FileOutputStream("Shawon.txt", true)){
            output.write(text.getBytes());// convert text to bytes and write
            output.write("\nI Love Java".getBytes());
            System.out.println("Successfully wrote to File");
        }
        catch (IOException e){
            System.out.println("An error occurs!");
            e.printStackTrace();
        }
    }
}

class CopyFile{
    public static void main (String[] args){
        try (FileInputStream myRead = new FileInputStream("abc.PNG");
             FileOutputStream myWrite = new FileOutputStream("defg.PNG")){
            int data;
            while((data = myRead.read()) != -1){
                myWrite.write(data); // write each raw byte to the new file
            }
            System.out.println("File copied successfully!");
        }
        catch(IOException e){
            System.out.println("Error.");
            e.printStackTrace();
        }
    }
}
package p12_file_handling;

import java.io.File;
import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;

public class F04_Read_Files {
    public static void main (String[] args){
        // Read Files using Scanner
        File myFile = new File("Shawon.txt");
        try(Scanner Sc = new Scanner(myFile)){
            while (Sc.hasNextLine()){  // Check if another line is available
                String data = Sc.nextLine();  // Read one complete line
                System.out.println(data);
            }
        }
        catch (IOException e){
            System.out.println("An error occurs!");
            e.printStackTrace();
        }
    }
}
// Read Files Using FileReader
class Filereader {
    public static void main (String[] args){
        try(FileReader Reader = new FileReader("twr.txt")){  // FileReader reads the file character by character
            int data;
            while ((data = Reader.read()) != -1){  // Read until the end of the file
                System.out.print((char)data);  // Convert integer to character and print
            }
        }
        catch (Exception e) {
            System.out.println("An exception occurs!");
            e.printStackTrace();
        }
    }
}

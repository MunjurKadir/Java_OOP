package p12_file_handling;

import java.io.File;
import java.io.IOException;

public class F02_Create_Files {
    public static void main(String[] args){
        try {
            File myFile = new File("Shawon.txt");  // Create File object

            if (myFile.createNewFile()){  // Try to create the file
                System.out.println("File created: " + myFile.getName());
            }
            else{
                System.out.println("File already exists.");
            }
        }
        catch(java.io.IOException e){
            System.out.println("An error Occur!");
            e.printStackTrace();  // Print full error details
        }

        // Create File in a specific directory
        try{
            File myFile = new File("D://Java//aBc.txt");
            myFile.createNewFile();
        }
        catch(IOException e){
            System.out.println("An error occurs!");
            e.printStackTrace();
        }
    }
}

package p12_file_handling;

import java.io.FileWriter;
import java.io.IOException;

public class F03_Write_Files {
    public static void main(String[] args){
       try{
           FileWriter myWriter = new FileWriter("Shawon.txt"); // Create FileWriter (creates file if it doesn't exist)
           myWriter.write("Hello!!\n"); // Write text to the file
           myWriter.write("I'm learning Java.");
           myWriter.close(); // Close the writer
           System.out.println("Successfully wrote to the File.");
       }
       catch (IOException e){
           System.out.println("An error ocurs.");
           e.printStackTrace();
       }
    }
}

// Write To a File with try-with-resources
class TWR {
    public static void main (String[] args){
        try (FileWriter mywriter = new FileWriter("twr.txt")){  // Automatically closes FileWriter
            mywriter.write("Write in File using try with resources.\n"); // Write text to the file
            System.out.println("Successfully wrote to File");
        }
        catch (IOException e){
            System.out.println("An Exception Occurs.");
            e.printStackTrace();
        }
    }
}

// Append to a File
class Append{
    public static void main(String[] args){
        try (FileWriter writer = new FileWriter("twr.txt", true)){ // true = append mode (does not overwrite)
            writer.write("We can write without overwriting using \"true\"");  // Add text to the end of the file
            System.out.println("Successful");
        }
        catch (IOException e){
            System.out.println("errors");
            e.printStackTrace();
        }
    }
}

// Other Ways to Write to Files
// FileWriter --> easiest choice for basic text.
// BufferedWriter --> better for large text files, because it is faster and supports handy features.
// FileOutputStream --> best for binary data (images, audio, PDFs)
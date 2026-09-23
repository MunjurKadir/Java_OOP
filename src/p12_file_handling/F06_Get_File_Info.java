package p12_file_handling;

import java.io.File;

public class F06_Get_File_Info {
    public static void main (String[] args){
        File myFile = new File("Shawon.txt");
        if (myFile.exists()){
            System.out.println("File name: " + myFile.getName());
            System.out.println("Absolute path: " + myFile.getAbsolutePath());
            System.out.println("Writeable: " + myFile.canWrite());
            System.out.println("Readable: " + myFile.canRead());
            System.out.println("File size in bytes: " + myFile.length());
        }
        else {
            System.out.println("File does not exist!");
        }
    }
}

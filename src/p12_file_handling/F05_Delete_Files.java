package p12_file_handling;

import java.io.File;
public class F05_Delete_Files {
    public static void main (String[] args){
        // Delete File/Folder
        // If you want to delete a Folder the Folder must be empty
        File f = new File("S.txt");
        if (f.delete()){
            System.out.println("File Deleted Successfully!");
        }
        else {
            System.out.println("Failed to delete the file!");
        }
    }
}

package p12_file_handling;

import java.io.File;

public class F01_Files {
    public static void main (String[] args){
        File myFile = new File("Shawon.txt");
    }
}
// The File class has many useful methods for creating and getting information about files.

// Method	             Type	                     Description
// canRead() 	        Boolean	         Tests whether the file is readable or not
// canWrite()	        Boolean	         Tests whether the file is writable or not
// createNewFile()	    Boolean	         Creates an empty file
// delete()	            Boolean	         Deletes a file
// exists()	            Boolean	         Tests whether the file exists
// getName()	        String	         Returns the name of the file
// getAbsolutePath()	String	         Returns the absolute pathname of the file
// length()	            Long	         Returns the size of the file in bytes
// list()	            String[]	     Returns an array of the files in the directory
// mkdir()	            Boolean	         Creates a directory
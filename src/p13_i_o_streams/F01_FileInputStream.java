package p13_i_o_streams;

import java.io.FileInputStream;
import java.io.IOException;

public class F01_FileInputStream {
    public static void main (String[] args){
        try(FileInputStream myFile = new FileInputStream("Shawon.txt")){
            int data;
            while ((data = myFile.read()) != -1){
                System.out.print((char) data);
            }
        } catch (IOException e) {
            System.out.println("An error occurs.");
            e.printStackTrace();
        }
    }
}

class image{
    public static void main(String[] args){
        try(FileInputStream myImage = new FileInputStream("abc.PNG")){
            int data;
            while ((data = myImage.read()) != -1){
                System.out.print((char) data);
            }
        }
        catch (IOException e){
            System.out.println("An error occurs.");
            e.printStackTrace();
        }
    }
}
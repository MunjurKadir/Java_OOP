package p09_user_input;
import java.util.Scanner;  // Import the Scanner class

//nextBoolean() --> Reads a boolean value from the user
//nextByte() --> Reads a byte value from the user
//nextDouble() --> Reads a double value from the user
//nextFloat() --> Reads a float value from the user
//nextInt() --> Reads a int value from the user
//nextLine() --> Reads a String value from the user
//nextLong() --> Reads a long value from the user
//nextShort() --> Reads a short value from the user
public class F01_Scanner_Class {
    public static void main (String[] args){
        Scanner myInput = new Scanner(System.in);  // Create a Scanner object
        String name = myInput.nextLine();  // Read user input
        System.out.println("My name is " + name);

        System.out.print("Enter your age: ");
        int age = myInput.nextInt();
        System.out.println("I'm " + age + " years old");

        System.out.print("Enter your CGPA: ");
        double myCGPA = myInput.nextDouble();
        System.out.println("I got CGPA " + myCGPA);
    }
}

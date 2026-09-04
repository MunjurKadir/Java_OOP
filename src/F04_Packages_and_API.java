import java.util.Scanner;
// import package.name.Class; --> Import a single class
// import package.name.*; --> Import the whole package

// Java API = A large library of ready-made classes provided by Java
// Java API → Packages → Classes → Methods / Fields

//Import a Class
public class F04_Packages_and_API {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.println("My name is " + name);
    }
}



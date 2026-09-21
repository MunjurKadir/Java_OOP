package p11_exceptions_handling;

import java.util.Scanner;

public class F04_Try_with_Resources {
    public static void main(String[] args) {
        // Normal Way
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name ");
        String name = sc.nextLine();
        System.out.println("Enter your age ");
        int age = sc.nextInt();

        System.out.println("Name: " + name + "\nAge: " + age);
        sc.close(); // manually close
    }
}


// Try With Resources
class TrywithResources{
    public static void main(String[] args){
        try(Scanner input = new Scanner(System.in)){
            System.out.println("Enter your name ");
            String nam = input.nextLine();
            System.out.println("Enter your age ");
            int ag = input.nextInt();

            System.out.println("Name: " + nam + "\nAge: " + ag);
        }
    }
}


package p11_exceptions_handling;

public class F02_Throw_Throws {

    public static void main(String[] args) {

        try {
            Main.checkAge(15);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

class Main {

    // 'throws' declares that this method may throw an exception
    static void checkAge(int age) throws Exception {

        if (age < 18) {

            // 'throw' is used to explicitly throw an exception
            throw new Exception("You are not eligible.");
        }
        else {

            // Runs when age is 18 or above
            System.out.println("You are eligible.");
        }
    }
}
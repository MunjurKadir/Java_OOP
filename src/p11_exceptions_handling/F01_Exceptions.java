package p11_exceptions_handling;

// try     → Try to execute risky code
// catch   → Handle the exception if it occurs
// finally → Execute this code whether exception occurs or not
public class F01_Exceptions {
    public static void main(String[] args){

        // try --> Code that may cause an exception is written inside try
        try {
            int x = 10;
            int y = 0;
            int z = x / y;  // Exception occurs here (cannot divide by zero)
            System.out.println(z);
        }

        // catch --> Handles the exception if an exception occurs in try
        catch (Exception e){
            // e.getMessage() --> Returns the message describing the exception
            System.out.println("Something went wrong. " + e.getMessage());
        }


        // try --> Code that may cause an exception
        try {
            int[] numbers = {10, 20, 30};
            System.out.println(numbers[8]);  // Exception: index 8 does not exist
        }

        // catch --> Runs when an exception occurs in try
        catch (Exception e){
            System.out.println("Something went wrong. " + e.getMessage());
        }

        // finally --> Always executes, whether an exception occurs or not
        finally {
            System.out.println("Finally Executed.");
        }


        // try --> Code that may cause an exception
        try {
            int a = 10;
            int b = 2;
            int c = a / b;
            System.out.println(c);
        }

        // catch --> Handles the exception if try causes an exception
        catch (Exception e){
            System.out.println("Something went wrong. " + e.getMessage());
        }

        // finally --> Always executes, whether an exception occurs or not
        finally {
            System.out.println("Done!");
        }
    }
}
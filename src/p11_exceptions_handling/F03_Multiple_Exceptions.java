package p11_exceptions_handling;

import java.lang.reflect.Array;

public class F03_Multiple_Exceptions {
    public static void main (String[] args){
        try {
            int[] Numbers = {10, 20, 30};
            System.out.println(Numbers[8]);
            int result = 10 / 0;
        }
        //  Always put more specific exceptions first, and general ones later. Otherwise,
        //  the general catch will grab the error and the specific ones will never run.
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array index does not exist. " + e.getMessage());
        }
        catch(ArithmeticException e){
            System.out.println("Can not divided by zero." + e.getMessage());
        }
        catch(Exception e){  //  Always put Exception (the general one) at the end.
            System.out.println("Something went wrong. " + e.getMessage());
        }
        System.out.println();

        // Multi Catch
        try {
            int result = 10 / 0;
            int[] Numbers = {10, 20, 30};
            System.out.println(Numbers[8]);
        }
        catch (ArithmeticException | ArrayIndexOutOfBoundsException e){  // you can catch multiple exceptions in one catch block using the | symbol
            System.out.println("Math error or Array error occur. " + e.getMessage());
        }
    }
}

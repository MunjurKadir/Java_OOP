package p08_enum;

public class F02_Loops_in_Enum {
    public static void main (String[] args){
        Days[] D = Days.values();  // Days.values() --> Returns all constants of the enum as an array.
        for (int i = 0; i < D.length; i++){  // Normal for loop with Enum
            System.out.println(D[i]);
        }
        System.out.println();
        // for (DataType variable : array/Collection)
        for (Days d: Days.values()){  // Enhanced for loop (for-each) with Enum
            System.out.println(d);
        }
        System.out.println();
        for (Days dd: Days.values()){  // Days.values() --> Returns all constants of the enum as an array.
            if (dd == Days.FRIDAY || dd == Days.SATURDAY){
                System.out.println("Weekend!");
            }
            else {
                System.out.println("Working Day!");
            }
        }
    }
}
enum Days{
    SATURDAY,
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY
}

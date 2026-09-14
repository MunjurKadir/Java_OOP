package p08_enum;
// Enum constructor is used to initialize data for each enum constant.
public class F03_Enum_Constructor {
    public static void main (String[] args){
        days1.SATURDAY.shownumber();
        days1.SUNDAY.shownumber();
        days1.MONDAY.shownumber();
    }
}
enum days1{
    SATURDAY(1),
    SUNDAY(2),
    MONDAY(3);
    private int number;
    days1(int number){
        this.number = number;
    }
    void shownumber (){
        System.out.println(number);
    }
}

enum Level {
    // Enum constants (each has its own description)
    LOW("Low level"),
    MEDIUM("Medium level"),
    HIGH("High level");
    // Field (variable) to store the description text
    private String s;
    // Constructor (runs once for each constant above)
    Level(String s){
        this.s = s;
    }
    // Getter method to read the description
    public String gets(){
        return s;
    }
}
class Main {
    public static void main (String[] args){
        Level myLevel = Level.MEDIUM;
        System.out.println(myLevel.gets());

        // Loop + Enum Constructor
        for(Level MyLevel: Level.values()){
            System.out.println(MyLevel + ": " + MyLevel.gets());
        }
    }
}
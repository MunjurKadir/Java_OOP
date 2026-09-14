package p08_enum;  // Enum = Enumeration, which means "specifically listed".
// enum is used to define a fixed set of constant values.

public class F01_Enums {
    public static void main(String[] args){
        Grade myGrade = Grade.A;
        System.out.println("I got " + myGrade);
    }
}
enum Grade {
    A, B, C, D, F
}
// Enum + if
enum TrafficLight {
    RED,
    GREEN
}
class Traffic {
    public static void main (String[] args){
        TrafficLight light = TrafficLight.RED;
        if (light == TrafficLight.RED){
            System.out.println("Stop");
        }
        else if (light == TrafficLight.GREEN){
            System.out.println("Go");
        }
    }
}
// Enum + switch
enum Day1{
    SATURDAY,
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY
}
class day{
    public static void main(String[] args) {
        Day1 D = Day1.MONDAY;
       switch (D){
           case FRIDAY:
               System.out.println("Weekend");
               break;
           case SATURDAY:
               System.out.println("Weekend");
               break;
           default:
               System.out.println("Working Day");
       }
    }
}

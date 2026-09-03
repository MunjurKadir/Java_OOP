package p03_Modifiers;

public class F01_Static {

}
class Student {
    String name;
    static int age = 45;
    static double cgpa = 3.80;
    static void StaticMethod(){
        System.out.println("Static methods can be called without creating objects");
    }
    public static void main (String[] args){
        System.out.println(Student.age);
        System.out.println(Student.cgpa);
        StaticMethod();
    }
}

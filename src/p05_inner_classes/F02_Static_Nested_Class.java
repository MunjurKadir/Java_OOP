package p05_inner_classes;

public class F02_Static_Nested_Class {
    public static void main (String[] args){
        // OuterClass.InnerClass objectName = new OuterClass.InnerClass();
        Car1.Engine1 engine1 = new Car1.Engine1();
        engine1.Start1();
    }
}
class Car1 {
    static class Engine1 {
        void Start1 (){
            System.out.println("Engine Starts!");
        }
    }
}
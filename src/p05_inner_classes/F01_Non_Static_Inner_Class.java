package p05_inner_classes;

public class F01_Non_Static_Inner_Class {
    public static void main (String[] args) {
        Car car = new Car();
        // OuterClass.InnerClass objectName = outerObject.new InnerClass();
        Car.Engine myEngine = car.new Engine();
        myEngine.Start();

        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println (myInner.number());
    }
    // A class declared inside another class is called a nested/inner class.
}
class Car {
    class Engine {
        void Start (){
            System.out.println ("Engine starts!");
        }
    }
}

class OuterClass {
    int x = 10;
    class InnerClass {
        int number (){
            return x;
        }
    }
}
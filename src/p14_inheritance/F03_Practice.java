package p14_inheritance;

import java.util.stream.StreamSupport;

public class F03_Practice {
    public static void main(String[] args){
        Car c1 = new Car();
        Car c2 = new Car("Honda");
        Car c3 = new Car("Honda", "Black");

        BMW b1 = new BMW();
        b1.sound();
        b1.sound(3);
        EVBMW e1 = new EVBMW();
        e1.name();
        e1.sound();
        e1.sound(2);
    }
}
class Car{
    String name;
    String colour;
    Car(){
        System.out.println("I Love Car!");
    }
    Car(String name){
        this.name = name;
        System.out.println("I Love " +  name  + " Car!");
    }
    Car(String name, String colour){
        this.name = name;
        this.colour = colour;
        System.out.println("I Love " + name + " Car specially " + colour + " colour!");
    }
        void sound(){
            System.out.println("Car has sound.");
        }
}
class BMW extends Car{
    // Method Overriding
    @Override
    void sound(){
        System.out.println("BMW sounds WOW!!!");
    }
    // Method  Overloading
    void sound(int n){
        System.out.println("BMW sounds " + n + " times.");
    }
}
class EVBMW extends BMW{
    void name(){
        System.out.println("Electric BMW car.");
    }
}
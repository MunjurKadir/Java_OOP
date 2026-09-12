package p06_abstraction;
// Abstraction --> To achieve security - hide certain details and only show the important details of an object.
public class F01_Abstract_Classes_and_Methods {
    public static void main(String[] args){
        Dog d = new Dog();
        d.AnimalSound();
        d.Sleep();
    }
}
abstract class Animal { // Abstract Class --> Abstract class is a way to achieve abstraction in Java.
    abstract void AnimalSound(); // Abstract method (does not have a body)
    void Sleep (){   // Regular method
        System.out.println("Zzz");
    }
}
// To access the abstract class, it must be inherited from another class.
class Dog extends Animal{ // Subclass (inherit from Animal)
    void AnimalSound(){
        // The body of animalSound() is provided here
        System.out.println("Dog barks");
    }
}

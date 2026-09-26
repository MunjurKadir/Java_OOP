package p14_inheritance;

public class F01_Inheritance {
    public static void main (String[] args){
        dog d = new dog();
        d.sound();
        d.bark();

        Dog1 d1 = new Dog1();
        d1.sound();
        d1.bark();
    }
}
// Inheritance allows a child class to acquire the properties and methods of a parent class.
class Animal {
    void sound (){
        System.out.println("Animal sounds");
    }
}
class dog extends Animal {  // extends --> extends is used to inherit and reuse members of a parent class.
    void bark (){
        System.out.println("Dog barks");
    }
}

// Abstract Modifier
abstract class Animal1{
    void sound (){
        System.out.println("Animal sounds");
    }
    abstract void bark();
}
class Dog1 extends Animal1 {
    void bark (){
        System.out.println("Dog barks");
    }
}

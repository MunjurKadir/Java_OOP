public class F05_Inheritance {
    public static void main (String[] args){
        Dog d = new Dog();
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
class Dog extends Animal{  // extends --> extends is used to inherit and reuse members of a parent class.
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
class Dog1 extends Animal1{
    void bark (){
        System.out.println("Dog barks");
    }
}

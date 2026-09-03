package p03_Modifiers;

public class F02_Abstract {
    public static void main (String[] args){
        Dog d = new Dog();
        Cat c = new Cat();
        d.sound();
        c.sound();
    }
}
abstract class Animal1 {
    abstract  void sound();
}
class Dog extends Animal1 { // SubClass
    void sound (){
        System.out.println("Dog says Woof");
    }
}
class Cat extends Animal1 { //SubClass
    void sound (){
        System.out.println("Cat says Meow");
    }
}
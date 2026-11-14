package p17_upcasting_dmd;

public class F01_Upcasting_DMD {
    // UpCasting, Dynamic Method Dispatch, DownCasting, Inheritance, Polymorphism
}
class Animal{
    int age;
    String name;
    // Parameterized constructor
    Animal(int age, String name){
        this.age = age;
        this.name = name;
        System.out.println("Animal");
    }
    void sound(){
        System.out.println("Animal make sound");
    }
}
class Dog extends Animal{
// Calls the parent constructor using super()
    Dog(int age, String name){
        super(age, name);
        System.out.println("Dog");
    }
    void sound(){
        System.out.println("Dog barks");
    }
}
class Cat extends Dog{
    // Calls the immediate parent constructor
    Cat(int age, String name){
        super(age, name);
    }
    // Displays inherited instance variables
    void display(){
        System.out.println("Age: " + age + " | Name: " + name);
    }
    void sound(){
        System.out.println("Cat mews");
    }
    void test(){
        super.sound();
    }
    public static void main(String[] args){
        Cat c = new Cat(5, "Tom");
        c.display();
        c.sound();
        Animal a = new Cat(4, "Oggy"); // upcasting
        a.sound(); // Dynamic Method Dispatch
        Cat cc = (Cat) a; // Downcasting
        cc.test(); // Method Calling
        ((Cat) a).test(); // Downcasting and Method Calling
    }
}

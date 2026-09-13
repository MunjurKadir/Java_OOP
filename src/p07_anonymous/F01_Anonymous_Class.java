package p07_anonymous;

// Anonymous class --> a class without a name, usually used for one-time use.
public class F01_Anonymous_Class {
    public static void main (String[] args){
        Animal A = new Animal(){
            void sound (){
                super.sound(); // Original method of Parent class Animal
                System.out.println("Cat meows");
            }
        }; // semicolon is required to end the line of code that creates the object
        A.sound();
    }
}
class Animal {
    void sound (){
        System.out.println("Animal makes sound");
    }
}
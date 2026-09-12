package p06_abstraction;

public class F02_Interface {
    public static void main (String[] args){
        Bkash B = new Bkash(); // Create a Bkash object
        B.pay();
        Card C = new Card();  // Create a Card object
        C.pay();
    }
}
interface Payment{
    void pay(); // interface method (does not have a body)
}
class Bkash implements Payment{  // Bkash "implements" the Payment interface
    public void pay() {  // The body of pay() is provided here
        System.out.println("Paid with Bkash");
    }
}
class Card implements Payment{  // Card "implements" the Payment interface
    public void pay(){  // The body of pay() is provided here
        System.out.println("Paid with Card");
    }
}

// Multiple Interface
class MultipleInterface{
    public static void main(String[] args){
        Duck D = new Duck();
        D.fly();
        D.swim();
    }
}
interface Flyable{
    void fly();
}
interface Swimable{
    void swim();
}
class Duck implements Flyable, Swimable {
    public void fly(){
        System.out.println("Duck can fly!");
    }
    public void swim(){
        System.out.println("Duck can swim!");
    }
}

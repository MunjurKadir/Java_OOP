package p14_inheritance;

public class F04_Multiple_Inheritance {
    public static void main (String[] args){
        duck D = new duck();
        D.eat();
        D.sound();
        D.Fly();
        D.Swim();
    }
}
abstract class animal{  // Object Can not be created of an Abstract Class.
    abstract void eat();
    void sound(){
        System.out.println("Animal makes sound.");
    }
}
interface swim{
    int a = 5;  // --> public static final a = 5;
    void Swim();  // --> public abstract void Swim();
}
interface fly{
    void Fly();  // --> public abstract void Fly();
}
class duck extends animal implements swim, fly{
    void eat(){
        System.out.println("Animal is eating.");
    }
    public void Swim(){
        System.out.println("Duck can Swim.");
    }
    public void Fly(){
        System.out.println("Duck can Fly.");
    }
}
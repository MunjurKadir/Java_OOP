package p04_super_keyword;

public class F01_Super_Keyword {
    public static void main (String[] args){
        cat c = new cat();
        c.Sound();

        Cow C = new Cow();
        C.PrintAnimal();

        dog d = new dog();

    }
}
// the super keyword is used to refer to the parent class of a subclass.
// super.variable; --> Parent class variable
// super.method(); --> Parent class method
// super(); -->  Parent class constructor

// Access Parent Methods
class Animal2{
    void AnimalSound(){
        System.out.println("Animal makes sound");
    }
}
class cat extends Animal2 {
    void Sound (){
        super.AnimalSound();
        System.out.println("Cat mewos");
    }
}
// Access Parent Attributes
class Animal3 {
    String name = "Cow";
}
class Cow extends Animal3 {
    void PrintAnimal (){
        System.out.println(super.name);
    }
}
// Call Parent Constructor
class Animal4 {
    Animal4 (){
        System.out.println("Animal is created!");
    }
}
class dog extends Animal4 {
    dog (){
        super(); // The call to super() must be the first statement in the subclass constructor.
        System.out.println("Dog is created!");
    }
}

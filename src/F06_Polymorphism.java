public class F06_Polymorphism {
    public static void main (String[] args){
        AAnimal A = new AAnimal();
        DDog D = new DDog();
        CCat C = new CCat();

        A.sound();
        D.sound();
        C.sound();
    }
}
// Polymorphism allows the same method to perform different actions depending on the object.
class AAnimal {
    void sound (){
        System.out.println("Animal makes sounds!");
    }
}
class DDog extends AAnimal {
    void sound (){
        System.out.println("Dog barks!");
    }
}
class CCat extends AAnimal{
    void sound (){
        System.out.println("Cat mewos!");
    }
}
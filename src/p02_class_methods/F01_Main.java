package p02_class_methods;

public class F01_Main {
    public static void main(String[] args){
        car mycar = new car();
        mycar.fullThrottle();
        mycar.speed(200);
    }
}
class car{
    public void fullThrottle(){
        System.out.println("The car is going as fast as it can!");
    }
    public void speed(int maxSpeed){
        System.out.println("Max Speed is " + maxSpeed);
    }
}

public class F01_Constructors {

}
class Main {
    int x;
    Main (){
        x = 5;
    }
    public static void main (String[] args){
        Main myObj = new Main();
        System.out.println(myObj.x);

        Main1 myObj1 = new Main1(6);
        System.out.println(myObj1.x);
    }
}
class Main1 {
    int x;
    Main1(int y) {
        x = y;
    }

}
class Car {
    int modelyear;
    String modelname;
    Car (int year, String name){
        modelyear = year;
        modelname = name;
    }
    public static void main (String[] args){
        Car myCar = new Car(1986, "Honda");
        System.out.println(myCar.modelyear + " " + myCar.modelname);
    }
}


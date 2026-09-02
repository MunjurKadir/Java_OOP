public class F01_Constructors {

}
class Main {
    int x;
    Main (){
        x = 5;
    } // Constructor
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
    } // Constructor

}
class Car {
    int modelyear;
    String modelname;
    Car (int year, String name){ // Constructor
        modelyear = year;
        modelname = name;
    }
    public static void main (String[] args){
        Car myCar = new Car(1986, "Honda");
        System.out.println(myCar.modelyear + " " + myCar.modelname);
    }
}
class Student {
    String name;
    int age;
    Student(String n, int a){ // Constructor
        name = n;
        age = a;
    }
    public static void main (String[] args){
        Student s1 = new Student("Shawon", 22);
        Student s2 = new Student("Rakib", 21);
        Student s3 = new Student("Mim", 23);

        System.out.println("Name: " + s1.name + "\nAge: " + s1.age);
        System.out.println("Name: " + s2.name + "\nAge: " + s2.age);
        System.out.println("Name: " + s3.name + "\nAge: " + s3.age);
    }
}


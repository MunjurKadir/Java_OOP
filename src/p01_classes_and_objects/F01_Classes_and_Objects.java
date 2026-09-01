package p01_classes_and_objects;

public class F01_Classes_and_Objects {
    public static void main(String[] args){
        object myobj = new object();
        object myobj1 = new object();

        System.out.println(myobj.x);
        myobj.x = 20;
        System.out.println(myobj.x);
        myobj.x = 30;
        System.out.println(myobj.x);
        System.out.println(myobj1.x);

        System.out.println(myobj.y);
        System.out.println(myobj1.y);
        // myobj.y = 35; // Not possible because of final keyword

        student s = new student();
        System.out.println("Name: " + s.fname + " " + s.lname);
        System.out.println("Age: " + s.age);
    }
}
class object{
    int x = 10;
    final int y = 25; // final --> to make variable constant
}
class student{
    String fname = "Rakib";
    String lname = "Hassan";
    int age = 22;
}


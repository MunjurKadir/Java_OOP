public class F02_This_Keyword {

}
// this in Constructors
class Student1 {
    String name;
    int age;
    Student1 (String name, int age){
        this.name = name;
        this.age = age;
    }
    public static void main (String[] args){
        Student1 s1 = new Student1("Shawon", 22);
        Student1 s2 = new Student1("Rakib", 21);
        Student1 s3 = new Student1("Mim", 23);

        System.out.println("Name: " + s1.name + "\nAge: " + s1.age);
        System.out.println("Name: " + s2.name + "\nAge: " + s2.age);
        System.out.println("Name: " + s3.name + "\nAge: " + s3.age);
    }
}
// this in Methods
class Student2 {
    String name;
    int age;
    void showinfo (){
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
    public static void main (String[] args){
        Student2 s1 = new Student2();
        s1.name = "Rakib";
        s1.age = 22;
        Student2 s2 = new Student2();
        s2.name = "Mim";
        s2.age = 23;

        s1.showinfo();
        s2.showinfo();
    }
}
// this()
class Student4 {
    String name;
    int age;

    Student4 () {
        this("Unknown", 0); // The call to this() must be the first statement inside the constructor.
    }

    Student4 (String name, int age) {
        this.name = name;
        this.age = age;
    }

    void showInfo() {
        System.out.println(name + " - " + age);
    }

    public static void main(String[] args) {

        Student4 s1 = new Student4("Shawon", 22);
        Student4 s2 = new Student4("Rakib", 21);
        Student4 s3 = new Student4("Mim", 23);
        Student4 s4 = new Student4();

        s1.showInfo();
        s2.showInfo();
        s3.showInfo();
        s4.showInfo();
    }
}

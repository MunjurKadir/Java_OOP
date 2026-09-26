package p14_inheritance;

public class F02_Hierarchical_Inheritance {
    public static void main (String[] args){
        B s1 = new B();
        s1.id = 117;
        s1.age = 22;
        s1.name = "SM Munjur Kadir";
        s1.Uni = "DIU";
        System.out.print(s1.id + " " + s1.age + " " + s1.name + " " + s1.Uni);

        System.out.println();

        C s2 = new C();
        s2.id = 117;
        s2.age = 22;
        s2.name = "SM Munjur Kadir";
        s2.Dept = "SWE";
        System.out.print(s2.id + " " + s2.age + " " + s2.name + " " + s2.Dept);
    }
}
class A {
    int id;
    int age;
    String name;
}
class B extends A {
    String Uni;
}
class C extends A {
    String Dept;
}


package p14_inheritance;

public class F03_Multi_Level_Inheritance {
    public static void main (String[] args){
        CC s = new CC();
        s.id = 117;
        s.age = 22;
        s.name = "SM Munjur Kadir";
        s.Uni = "DIU";
        s.Department = "SWE";
        s.year = 2026;

        System.out.print(s.id + " " + s.age + " " + s.name + " " + s.Uni + " " + s.Department + " " + s.year);
    }
}
class AA {
    int id;
    int age;
    String name;
}
class BB extends AA {
    String Uni;
}
class CC extends BB{
    String Department;
    int year;
}


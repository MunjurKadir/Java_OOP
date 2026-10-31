package p15_encapsulation;

public class F02_Encapsulation_Practice1 {
    public static void main(String[] args){
        Student1 s2 = new Student1("Rakib", 3.71);
        System.out.println("Name: " + s2.getName());
        System.out.println("CGPA: " + s2.getCgpa());
        s2.setCgpa(4.50);
        System.out.println("Updated cgpa: " + s2.getCgpa());
        Student1 s3 = new Student1("Mim", 4.54);
        System.out.println("Name: " + s3.getName());
        System.out.println("CGPA: " + s3.getCgpa());
    }
}
class Student1{
    private String name;
    private double cgpa;
    public Student1(String name, double cgpa){
        this.name = name;
        if(cgpa > 0.00 && cgpa <= 4.00){
            this.cgpa = cgpa;
        }
        else{
            System.out.println("Invalid CGPA!");
        }
    }
    public void setCgpa(double cgpa){
        if(cgpa <= 4.00 && cgpa > 0){
            this.cgpa = cgpa;
        }
        else{
            System.out.println("Invalid CGPA!");
        }
    }
    public String getName(){
        return name;
    }
    public double getCgpa(){
        return cgpa;
    }
}

package CoderArmy;

public class Demo {
    public static void main(String args[]){
        student s1 = new student("Rounak", 20, 101);
        student s2 = new student("sushant", 21, 102);
        //System.out.println(student.collegeName);
        //s1.collegeName = "Amity University, Noida";
        //student.collegeName = "Amity University, Noida";
        System.out.println(s1.name+" "+s1.age+" "+s1.rollno+" "+student.collegeName);
        System.out.println(s2.name+" "+s2.age+" "+s2.rollno+" "+student.collegeName);
    }
}

class student {
    String name;
    int age;
    int rollno;
    static String collegeName;

    student(String name, int age, int rollno){
        this.name = name;
        this.age = age;
        this.rollno = rollno;
    }

    static {
        collegeName = "Amity University";
    }

}

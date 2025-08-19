package OOPs;

public class oops1 {
    public static void main(String [] args){

        Pen p1 = new Pen();
        p1.setColor("blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.gettip());
        p1.setColor("yellow");
        System.out.println(p1.getColor());

        Person per = new Person();
        per.setName("different");
        System.out.println(per.getname());
        per.setAddress("Delhi");
        System.out.println(per.getaddress());
        per.setAge(21);
        System.out.println(per.getage());

        // Encapsulation

        Car car1 = new Car();
        car1.setName("maruti suzuki");
        System.out.println(car1.getname());
        car1.setModel("full petroleum");
        System.out.println(car1.getmodel());
        car1.setYear(1993);
        System.out.println(car1.getyear());

        //constructor

        Student std1 = new Student();

        Student std = new Student("rounak", 78);
        System.out.println(std.name);
        System.out.println(std.roll_no);

        Student std2 = new Student(45);
        System.out.println(std2.roll_no);

        // copy constructor

        Teacher T1 = new Teacher();
        T1.Salary = "66570";
        System.out.println(T1.Salary);
        T1.name = "Kaa ho ka haal ba";
        T1.password = "iusgfugerug";
        T1.marks[0] = 100;
        T1.marks[1] = 97;
        T1.marks[2] = 94;
        
        Teacher T2 = new Teacher(T1);
        T2.password = "ncbjsdcvafdb";

        T1.marks[2] = 99;

        System.out.println(T1.marks[2]);
         
    }

}

class Pen{
    private String color;
    private int tip;

    String getColor(){
        return this.color;
    }

    int gettip(){
        return this.tip;
    }

    void setColor(String newColor){
        this.color = newColor;
    }

    void setTip (int newTip){
        this.tip = newTip;
    }

}

//Encapsulation
class Car {
    private String name;
    private String model;
    private int year;

    String getname(){
        return this.name;
    }

    String getmodel(){
        return this.model;
    }

    int getyear(){
        return this.year;
    }

    void setName(String newName){
        this.name = newName;
    }

    void setModel(String newModel){
        this.model = newModel;
    }

    void setYear(int newYear){
        this.year = newYear;
    }

}

//constructor

class Student{
    String name;
    int roll_no;

    Student(){
        System.out.println("constructor is called without parameter that is known as no-parametrazied Constructor");
    }

    Student(String name, int roll_no){
        this.name = name;
        this.roll_no = roll_no;
    }

    Student(int roll_no){
        this.roll_no = roll_no;
    }

}

class Person{
    private String name;
    private String address;
    private int age;

    String getname(){
        return this.name;
    }

    String getaddress(){
        return this.address;
    }

    int getage(){
        return this.age;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public void setAddress(String newAddress){
        this.address = newAddress;
    }

    public void setAge(int newAge){
        this.age = newAge;
    }

}



// Constructor with copy constructor

//isme constructor overloading bhi hai

class Teacher{
    String name;
    String Salary;
    String password;
    int marks[];

    //Copy constructor

    Teacher(Teacher T1){
        marks = new int [3];
        this.name = T1.name;
        this.Salary = T1.Salary;
        this.marks = T1.marks;
    }

    Teacher(){
        marks = new int[3];
        System.out.println("constructor with copy constructor");
    }

    Teacher(String newName, String newSalary){
        marks = new int[3];
        this.name = newName;
        this.Salary = newSalary;
    }

    Teacher(String newPassword){
        marks = new int[3];
        this.password = newPassword;
    }
}
package CoderArmy;

public class Demo1 {
    public static void main(String[] args){
        BankAccount ba = new BankAccount();
        ba.deposit(500);
        ba.withdraw(199);
        ba.getbalance();
        System.out.println(ba.getbalance());
    }
}

class BankAccount{
    private double balance;

    public void deposit(int amount){
        balance = balance + amount;
    }

    public void withdraw(int amount){
        balance -= amount;
    }

    public double getbalance(){
        return balance;
    }
}


class student {
    private String name;
    private int age;
    private int rollno;
    private String college;

    student(String name, int age, int rollno, String college){
        this.name = name;
        this.age = age;
        this.rollno = rollno;
        this.college = college;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getCollege(){
        return college;
    }

    public void setCollege(String college){
        // validation --> if(college.equals("Amity University")){ OR college should be real.
        this.college = college;
    }
}
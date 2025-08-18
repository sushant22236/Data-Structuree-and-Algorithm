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


        // Encapsulation

        Car car1 = new Car();
        car1.setName("maruti suzuki");
        System.out.println(car1.getname());
        car1.setModel("full petroleum");
        System.out.println(car1.getmodel());
        car1.setYear(1993);
        System.out.println(car1.getyear());
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
package OOPs;

public class oops2 {

    public static void main(String args[]){

        Fish shark = new Fish();
        shark.eat();
    }
    
}

//parent/ base class
class Animal {
    
    String color;

    void eat(){
        System.out.println("eat");
    }

    void breath(){
        System.out.println("breath");
    }
}


//child/ derived class

class Fish extends Animal{

    int fins;

    void swim(){
        System.out.println("swimming");
    }

}

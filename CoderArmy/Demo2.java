package CoderArmy;


public class Demo2 {
    public static void main(String[] args){

        Car car = new ElectricCar();
        Car2 car1 = new Diesel();
        car.start();

        car1.accelerate();

    }
}

abstract class Car2{

    void start(){
        System.out.println("car has started");
    }

    abstract void accelerate();
    abstract void brake();
}

class Diesel extends Car2{

    @Override
    void accelerate(){
        System.out.println("Diesel car has accelerated");
    }

    @Override
    void brake(){
        System.out.println("Diesel car has accelerated");
    }
}

class Petrol extends Car2{

    @Override
    void accelerate(){
        System.out.println("Petrol car has accelerated");
    }

    @Override
    void brake(){
        System.out.println("Petrol car has braked");
    }
}

interface Car {

    void start();
    void accelerate();
    void brake();
}

class ElectricCar implements Car {

    @Override
    public void start(){
        System.out.println("Electric car has started");
    }

    @Override
    public void accelerate(){
        System.out.println("Electric car has accelerated");
    }

    @Override
    public void brake(){
        System.out.println("Electric has braked");
    }
}

class FuelCar implements Car{

    @Override
    public void start(){
        System.out.println("Fuel car has started");
    }

    @Override
    public void accelerate(){
        System.out.println("Fuel car has accelerated");
    }

    @Override
    public void brake(){
        System.out.println("Fuel car has braked");
    }
}

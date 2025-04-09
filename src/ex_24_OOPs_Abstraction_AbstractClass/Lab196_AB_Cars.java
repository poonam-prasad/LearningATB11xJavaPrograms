package ex_24_OOPs_Abstraction_AbstractClass;

public class Lab196_AB_Cars {
    public static void main(String[] args) {
        WagonR w=new WagonR();
        w.drive();

    }
}

abstract class Car{
    abstract void startEngine();
    abstract void stopEngine();

    void normalFunction(){
        System.out.println("This is Normal function");
    }
}

class WagonR extends Car{
    void startEngine(){
        System.out.println("Start Engine");
    }

    void stopEngine(){
        System.out.println("Stop Engine");
    }

    void drive(){
        startEngine();
        stopEngine();
        normalFunction();
    }
}
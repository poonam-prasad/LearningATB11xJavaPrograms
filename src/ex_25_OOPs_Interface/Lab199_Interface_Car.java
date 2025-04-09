package ex_25_OOPs_Interface;

public class Lab199_Interface_Car {
    public static void main(String[] args) {
        Car c1=new Car();
        c1.drive();

    }
}

interface engine{
    void startEngine();
    void stopEngine();

    default void test(){
        System.out.println("Engine Ready");
    }
}

interface brakes{
    void applyBrakes();
}

class Car implements engine,brakes{
    public void startEngine()
    {
        System.out.println("Start Engine");
    }

    public void stopEngine(){
        System.out.println("Stop Engine");
    }

    public void applyBrakes(){
        System.out.println("Apply Brakes");
    }

    public void drive(){
        startEngine();
        stopEngine();
        applyBrakes();
        test();
    }
}
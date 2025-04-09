package ex_23_OOPs_Super;

public class Lab193_SuperKeyword {
    public static void main(String[] args) {

        Car c1=new Car();
        c1.display();
    }
}

class Vehicle{

    public int speed=120;

    //Constructor OverLoading
    Vehicle()
    {System.out.println("Parent Default Constructor");
    }

    Vehicle(int a){
        System.out.println("Parent Parameterized constructor");
    }

    //Method OverLoading
    void message(){
        System.out.println("Parent No argument No return type Method");
    }

    void message(int a){
        System.out.println("Parent With Argument No Return Method "+a);
    }

    void display(){
        System.out.println("Parent Display Method");
    }
}

class Car extends Vehicle{

    //Encapsulation
    private int speed=150;
    int getSpeed()
    {
        return speed;
    }

    void setSpeed(int speed){
        this.speed=speed;
    }
    Car(){
        super();
        System.out.println("Child Default constructor");

    }
    Car(int a){
        super(10);
        System.out.println("Child Parameterized constructor");
    }

    //Method Overriding
    @Override
    void display() {
        System.out.println("Child display method");
        super.display();
        super.message();
        super.message(10);
        System.out.println(this.speed);
        System.out.println(super.speed);
        System.out.println("Method Overriding");

    }
}
package ex_25_OOPs_Interface;

public class Lab202_Abstraction {
    public static void main(String[] args) {

        ConcreteClass c=new ConcreteClass();
        c.display();
        c.display1();


    }
}
class ConcreteClass implements IncompleteInterface{
    public void display(){
        System.out.println("Display implemented");
    }
}
interface IncompleteInterface{
    final int a=10;
    void display();

   default void display1(){
        System.out.println("Default Display");
    }

    static void display2(){
        System.out.println("Static display");
    }
}

abstract class IncompleteAbstract{

     int a=10;
    abstract void display();

    void displayAbstract(){
        System.out.println("Display for Abstract");
    }

}

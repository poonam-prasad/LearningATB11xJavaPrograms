package ex_17_OOPs;

public class Lab166_OOPsConcept {
    public static void main(String[] args) {
        Person Amit; //Class is User defined data type
        Person p1=new Person(); //Person is Class
        //p1-- Object reference variable
        //new Person()--Object
        p1.name="Poonam";
        System.out.println(p1.greet("Poonam"));
        System.out.println(p1.remainingAmount());

        Person p2=new Person();
        p2.name="Amit";
        p2.sleep();

        new Person().name="No reference";
        System.out.println(new Person().name);//No Reference

    }
}

class Person{
    String name; //Instance variable/Data members/Attributes/Properties
    int age;
    boolean is_Married;
    double salary=2000.00;
    double tax=100.00;

    //Member Functions, Behavior, Function,Method
    void sleep()
    {
        System.out.println("Sleep");
    }

    String greet(String name){
        return "Hello "+name;
    }

    double remainingAmount(){
        return salary-tax;
    }

}

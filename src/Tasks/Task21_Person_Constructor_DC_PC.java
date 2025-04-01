package Tasks;

import java.sql.SQLOutput;

public class Task21_Person_Constructor_DC_PC {
    public static void main(String[] args) {

        //Default Constructor will be called
        Person4 p1=new Person4();
        System.out.println("Name is: "+p1.name+" , Age is: "+p1.age+" , Address is: "+p1.address+" , Phone no is: "+p1.phoneNo+" , isMale: "+p1.isMale);

        System.out.println("------------------------------");

        //Parameterized Constructor will be called
        Person4 p2=new Person4("Poonam",30,"Bengaluru",989786565l,false);
        System.out.println("Name is: "+p2.name+" , Age is: "+p2.age+" , Address is: "+p2.address+" , Phone no is: "+p2.phoneNo+" , isMale: "+p2.isMale);

        System.out.println("------------------------------");

        p1.eat();
        p1.sleep();
        p1.walk();
        p1.doHomeWork();

        System.out.println("------------------------------");

        p2.eat();
        p2.sleep();
        p2.walk();
        p2.doHomeWork();
    }
}

class Person4{
    //Instance variables,Data members,Properties,Attributes
    //name, age, address, phone, isMale.
    String name;
    int age;
    String address;
    long phoneNo;
    boolean isMale;

    // eat, sleep, walk, doHome, printDetails()-
    //Member Functions,Methods

    Person4(){
        name="Unknown";
        age=100;
        address="Unknown Address";
        phoneNo=12334567l;
        isMale=false;
        System.out.println("Default Constructor called!!");
    }

    Person4(String name,int age,String address,long phoneNo,boolean isMale)
    {
        this.name=name;
        this.age=age;
        this.address=address;
        this.phoneNo=phoneNo;
        this.isMale=isMale;
        System.out.println("Parameterized constructor called!");
    }

    void eat()
    {
        System.out.println(this.name+" is eating");
    }

    void sleep()
    {
        System.out.println(this.name+" is sleeping");
    }

    void walk()
    {
        System.out.println(this.name+" is walking");
    }

    void doHomeWork()
    {
        System.out.println(this.name+" does assignment everyday");
    }

}
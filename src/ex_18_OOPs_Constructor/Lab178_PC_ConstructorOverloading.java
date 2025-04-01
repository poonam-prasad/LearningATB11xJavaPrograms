package ex_18_OOPs_Constructor;

import ex_17_OOPs.Person2;

public class Lab178_PC_ConstructorOverloading {
    public static void main(String[] args) {
        Person1 p1=new Person1();
        System.out.println(p1.name);
        System.out.println(p1.phoneNo);

        Person1 p2=new Person1("Poonam",956467898,"Bangalore");
        System.out.println(p2.name+" "+p2.phoneNo+" "+p2.address);

        Person1 p3=new Person1("Amit",765768699);
        System.out.println(p3.address);

        p1.eat();
        p2.eat();
        p3.eat();

    }
}

class Person1 {
    String name;
    long phoneNo;
    String address;

    Person1() {
        System.out.println("Default constructor called!");
    }

    Person1(String name, long phoneNo,String address)
    {
    this.name=name;
    this.phoneNo=phoneNo;
    this.address=address;
    System.out.println("Parameterized constructor with 3 parameters called!");
    }

    Person1(String name, long phoneNo)
    {
        this.name=name;
        this.phoneNo=phoneNo;
        System.out.println("Parameterized constructor with 2 parameters called!");
    }

    void eat()
    {
        System.out.println(this.name+" is eating!");
    }

}
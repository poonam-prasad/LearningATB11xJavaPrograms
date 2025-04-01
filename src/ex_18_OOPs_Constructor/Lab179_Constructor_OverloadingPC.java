package ex_18_OOPs_Constructor;

import ex_17_OOPs.Person2;

public class Lab179_Constructor_OverloadingPC {
    public static void main(String[] args) {
        Person3 p1=new Person3();
        p1.name="Shikha";
        System.out.println(p1.name);


        Person3 p2=new Person3("Poonam",2312314,"Ranchi");
        System.out.println(p2.address);

        Person3 p3=new Person3("Amit",568768);
        System.out.println(p3.address);

        p1.eat();
        p2.eat();
        p3.eat();
    }
}
class Person3{
String name;
long phoneNo;
String address;

Person3(){
    System.out.println("Default constructor");
}

Person3(String name,long phoneNo,String address)
{
    this.name=name;
    this.phoneNo=phoneNo;
    this.address=address;
    System.out.println("Parameterized Constructor 3 Parameters");
}

    Person3(String name,long phoneNo)
    {
        this.name=name;
        this.phoneNo=phoneNo;
        System.out.println("Parameterized Constructor 2 Parameters");
    }

    void eat(){
        System.out.println(this.name+" is eating");
    }
}
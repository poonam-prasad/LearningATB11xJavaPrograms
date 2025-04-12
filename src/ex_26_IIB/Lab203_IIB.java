package ex_26_IIB;

public class Lab203_IIB {
    public static void main(String[] args) {

        new A();

    }
}

class A{
    A(){
        System.out.println("Default constructor");
    }
    {
        System.out.println("IIB1");
    }

    {
        System.out.println("IIB2");
    }
}
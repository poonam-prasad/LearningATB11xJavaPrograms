package ex_26_IIB;

public class Lab204_IIB2 {
    public static void main(String[] args) {

        A1 a=new A1();
        A1 a1=new A1();

    }
}

class A1{
    A1(){
        System.out.println("DC");
    }

    {
        System.out.println("I am IIB1");
    }

    {
        System.out.println("I am IIB2");
    }
}
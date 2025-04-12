package ex_27_StaticBlock;

import java.sql.SQLOutput;

public class Lab205_Static1 {
    public static void main(String[] args) {
        P p1=new P();
        P p2=new P();

    }
}

class P{

    P(){
        System.out.println("Default constructor");
    }
    //static executed only once when class is loaded
    static{
        System.out.println("Static Block");
    }

    {
        System.out.println("IIB");
    }

}
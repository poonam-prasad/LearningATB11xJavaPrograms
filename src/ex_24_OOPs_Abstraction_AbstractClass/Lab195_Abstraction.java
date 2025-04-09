package ex_24_OOPs_Abstraction_AbstractClass;

public class Lab195_Abstraction {
    public static void main(String[] args) {
        Son s1=new Son();
        s1.loan50k();
        s1.loan25k();

        //Father f=new Father();//Cannot create object of Abstract class

        Father f2=new Son(); //Dynamic dispatch
        f2.loan25k();
        f2.loan50k();
    }

}

abstract class Father{
    abstract void loan50k();
    void loan25k(){
        System.out.println("25K Loan paid by Father");
    }
}

class Son extends Father{
   void loan50k(){
       System.out.println("Son paid 50k loan");
   }
}
package ex_19_OOPs_Inheritance;

public class Lab180_SingleInheritance {
    public static void main(String[] args) {

        Father f1=new Father();
        System.out.println(f1.gold_f);
        f1.bhk2();

        Son s1=new Son();
        s1.bhk3();
        s1.bhk2();
        System.out.println(s1.gold_f);
    }
}

class Father{
    int gold_f=1000;
     void bhk2(){
         System.out.println("Father has 2BHK flat");
     }
}

class Son extends Father{

    void bhk3(){
        System.out.println("Son has 3BHK flat");
    }
}
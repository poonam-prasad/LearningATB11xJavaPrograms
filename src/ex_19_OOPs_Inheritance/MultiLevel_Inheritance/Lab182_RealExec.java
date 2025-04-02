package ex_19_OOPs_Inheritance.MultiLevel_Inheritance;

public class Lab182_RealExec {
    public static void main(String[] args) {
        GrandFather gf=new GrandFather();
        System.out.println(gf.gold_gf);
        gf.bhk1();
        gf.home();

        System.out.println("-------------");

        Father f=new Father();
        f.bhk2();
        f.bhk1();
        f.home();
        System.out.println(f.gold_gf);

        System.out.println("---------------");

        Son s=new Son();
        s.bhk1();
        s.bhk2();
        s.bhk3();
        s.home();
        System.out.println(s.gold_gf);
    }
}

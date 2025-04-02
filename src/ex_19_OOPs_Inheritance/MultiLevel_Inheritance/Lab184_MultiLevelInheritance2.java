package ex_19_OOPs_Inheritance.MultiLevel_Inheritance;

public class Lab184_MultiLevelInheritance2 {
    public static void main(String[] args) {

        Son amit =new Son();
        amit.bhk1();
        amit.bhk2();
        amit.bhk3();
        System.out.println(amit.gold_gf);

        System.out.println("--------------");

        GrandFather g=new GrandFather();
        g.home();
        System.out.println("--------------");

        Father f=new Father();
        f.home();
        System.out.println("--------------");

        GrandFather gf1=new Son();
        gf1.home();

    }
}

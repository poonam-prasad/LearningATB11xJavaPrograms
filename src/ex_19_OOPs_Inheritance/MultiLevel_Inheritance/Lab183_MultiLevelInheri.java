package ex_19_OOPs_Inheritance.MultiLevel_Inheritance;

public class Lab183_MultiLevelInheri {
    public static void main(String[] args) {


        //Father f1=new GrandFather();  //Not allowed

        GrandFather gf=new Son(); //Dynamic dispatch
        gf.home(); //Son's home method called

        GrandFather g=new Father();
        g.home(); //Father home method called

        Father f=new Son();
        f.home(); //Son's home method called
    }
}

package ex_19_OOPs_Inheritance.HierarchialInheritance;

public class Lab185_HierarchicalInheritance {
    public static void main(String[] args) {
        Father f=new Father();
        f.home();

        Son s =new Son();
        s.home();
        s.s();

        Daughter d=new Daughter();
        d.home();
        d.d();

    }
}

class Father{
    void home(){
        System.out.println("Father home 1bhk");
    }
}

class Son extends Father{
    void s(){
        System.out.println("Son home 2bhk");
    }
}

class Daughter extends Father{
    void d(){
        System.out.println("Daughter home 3bhk");
    }
}
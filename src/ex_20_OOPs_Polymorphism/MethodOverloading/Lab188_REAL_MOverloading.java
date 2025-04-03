package ex_20_OOPs_Polymorphism.MethodOverloading;

public class Lab188_REAL_MOverloading {
    public static void main(String[] args) {
        Home h=new Home();
        h.task(1);
        h.task(1,2);
        h.task(1,2,3);
    }
}

class Home{

    void task(int a)
    {
        System.out.println(a);
    }

    void task(int a ,int b){
        System.out.println(a+b);
    }

    void task(int a,int b,int c)
    {
        System.out.println(a+b+c);
    }
}

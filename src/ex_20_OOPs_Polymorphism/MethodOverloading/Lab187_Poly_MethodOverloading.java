package ex_20_OOPs_Polymorphism.MethodOverloading;

public class Lab187_Poly_MethodOverloading {
    public static void main(String[] args) {
        MathOperations m1=new MathOperations();
        System.out.println(m1.add(5,5));
        System.out.println(m1.add(5,5,5));
        System.out.println(m1.add(1.1,2.2));
        System.out.println(m1.add("Hello","Java"));
    }
}

class MathOperations{

    int add(int a,int b){
        return a+b;
    }

    int add(int a, int b,int c)
    {
        return a+b+c;
    }

    double add(double a,double b){
        return a+b;
    }

    String add(String a,String b){
        return a+b;
    }
}
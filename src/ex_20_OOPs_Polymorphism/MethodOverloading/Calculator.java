package ex_20_OOPs_Polymorphism.MethodOverloading;

public class Calculator {

    int attribute;

    int sum(int a,int b)
    {
        return a+b;
    }

    double sum(double a, double b)
    {
        return a+b;
    }

    public static void main(String[] args) {
        Calculator c1=new Calculator();
        System.out.println(c1.sum(5,5));
        System.out.println(c1.sum(1.1,4.4));
    }
}

package ex_31_Generics;

public class Lab236_Generics {
    public static void main(String[] args) {

        System.out.println(add(2,3));
        System.out.println(add(1.1,2.2));
        System.out.println(add("Hello","Poonam"));

    }

    static int add(int a,int b){
        return a+b;
    }

    static double add(double a, double b){
        return a+b;
    }

    static String add(String a,String b){
        return a+b;
    }
}

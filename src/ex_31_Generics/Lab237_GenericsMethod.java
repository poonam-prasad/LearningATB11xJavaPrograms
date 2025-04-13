package ex_31_Generics;

public class Lab237_GenericsMethod {
    public static void main(String[] args) {
        add(2,3);
        add(1.1,2.2);
        add("Poonam","Prasad");
    }

    public static <T> T add(T a, T b){
        System.out.println(a);
        System.out.println(b);
        return null;
    }
}

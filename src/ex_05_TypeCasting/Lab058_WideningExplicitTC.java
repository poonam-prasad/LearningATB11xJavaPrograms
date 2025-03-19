package ex_05_TypeCasting;

public class Lab058_WideningExplicitTC {
    public static void main(String[] args) {

        //Explicit Widening Type casting
        byte b = 20;
        int a = (int) b;  //Explicit TC not required since its widening
        System.out.println(a);
    }

}

package ex_05_TypeCasting;

public class Lab061_TypeCasting {
    public static void main(String[] args) {
        int course=100;
        float GST=18.45f;
        int total1=course+(int)GST; //Explicit TC since its narrowing from float to int
        System.out.print(total1+" ");

        float total2=course +(float)GST; //Explicit TC not needed since its Widening
        System.out.print(total2+" ");

        float total3=course+GST;  //Implicit Type casting done automatically since its widening
        System.out.print(total3);


    }
}

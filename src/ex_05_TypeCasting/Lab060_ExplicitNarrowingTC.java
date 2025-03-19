package ex_05_TypeCasting;

public class Lab060_ExplicitNarrowingTC {
    public static void main(String[] args) {
        long phoneNo=9876543210l;

        short s=(short) phoneNo; //Explicit Narrowing Type casting, data loss

        System.out.println(s);
    }
}

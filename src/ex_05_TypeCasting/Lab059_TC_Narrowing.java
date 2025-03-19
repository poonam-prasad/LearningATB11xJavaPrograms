package ex_05_TypeCasting;

public class Lab059_TC_Narrowing {
    public static void main(String[] args) {
        int num=300;
        //byte b=num; //Inplicit TC not allowed while Narrowing

        byte b=(byte)num; //Explicit Type casting while Narrowing, Data loss

        System.out.println(b);
    }
}

package ex_29_Wrapper;

public class Lab214_WrapperConversion {
    public static void main(String[] args) {

        int a1=10;
        Integer a2=a1; //This boxing, AutoBoxing, JVM will automatically store value from Primitive to Wrapper
        System.out.println(a2.intValue());
        System.out.println(Integer.MAX_VALUE);

        Integer b1=123;
        int b2=b1; //Unboxing-Conversion from Wrapper class to Primitive data type,attribute,behavior lost
        System.out.println(b2);

    }
}

package ex_29_Wrapper;

public class Lab215_WrapperConversionPart2 {
    public static void main(String[] args) {
         String num="123";
         String num1="1";

         //String to Wrapper-->ParseX ,ValueOf
        Integer numWrapper=Integer.parseInt(num);
        Integer numWrapper1=Integer.valueOf(num1);

        System.out.println(numWrapper);
        System.out.println(numWrapper1);

        //String to Primitive data type
        String num2="12345";
        int num3=Integer.parseInt(num2);
        System.out.println(num3);

        //Wrapper to String
        System.out.println(numWrapper.toString());

        //Primitive to String
        int number=12;
        Integer wrapperNumber=number;
        System.out.println(wrapperNumber.toString());


    }
}

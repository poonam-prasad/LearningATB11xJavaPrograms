package ex_30_Exceptions;

public class Lab226_IQ2 {
    public static void main(String[] args) {
        int a=0;
        int b=0;
        System.out.println(1);
        try{
             a=10/b; //Vulnerable code
        }
        catch (ArithmeticException e){
            System.out.println("Are you Fool");
        }
        catch (Exception e){
            System.out.println("Are you Fool!!");
        }
        System.out.println(2);
    }
}

package ex_30_Exceptions;

public class Lab227_TryCatchFinally {
    public static void main(String[] args) {
        int a=1;
        int b=0;

        try
        {
            b=5/2;
            System.out.println(b);
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("I will be always executed!");
        }
    }
}

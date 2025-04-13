package ex_30_Exceptions;

public class Lab226_IQ2 {
    public static void main(String[] args) {
        int a=0;
        int b=0;

        try{
             a=10/b; //Vulnerable code
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}

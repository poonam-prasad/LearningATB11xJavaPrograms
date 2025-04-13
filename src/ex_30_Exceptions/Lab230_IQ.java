package ex_30_Exceptions;

public class Lab230_IQ {
    public static void main(String[] args) {
        final double pi=3.141;
        int a=0;
        try{
            a=10/a;
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("I will be executed anyhow");
        }
    }
}

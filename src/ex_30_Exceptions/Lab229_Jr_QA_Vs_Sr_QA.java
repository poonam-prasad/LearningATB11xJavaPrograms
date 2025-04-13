package ex_30_Exceptions;

public class Lab229_Jr_QA_Vs_Sr_QA {
    public static void main(String[] args) {
        String num = null;

        try {
            num = args[0];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        try{

             int newNo=Integer.parseInt(num);
        }
        catch (NumberFormatException e)
        {
            System.out.println(e.getMessage());
        }
        try{
            int a=10/0;
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
package ex_30_Exceptions;

public class Lab225_IQ {
    public static void main(String[] args) {
        try{
            String inputUser=args[0];
            int a=Integer.parseInt(inputUser);
            int result=10/a;
        }

        catch (ArrayIndexOutOfBoundsException|NumberFormatException|ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}

package ex_30_Exceptions;

public class Lab221_TryCatch {
    public static void main(String[] args) {
        int a=0;
        System.out.println(1);
        try{
            a=10/0;
        }

        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }

        catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println(2);

    }
}

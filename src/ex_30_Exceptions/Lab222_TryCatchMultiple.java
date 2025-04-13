package ex_30_Exceptions;

public class Lab222_TryCatchMultiple {
    public static void main(String[] args) {
        int a=0;
        System.out.println(1);
        try {
            a = 10 / a;
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println(2);
    }
}

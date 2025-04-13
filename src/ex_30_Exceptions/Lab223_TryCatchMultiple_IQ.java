package ex_30_Exceptions;

public class Lab223_TryCatchMultiple_IQ {
    public static void main(String[] args) {
        int a=0;
        System.out.println(1);
        try{
            a=10/a;
        }

        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

        //Individual exception cannot be placed after main Exception class
        /*catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }*/

        System.out.println(2);
    }
}

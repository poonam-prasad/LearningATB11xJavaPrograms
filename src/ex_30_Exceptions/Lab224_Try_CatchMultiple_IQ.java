package ex_30_Exceptions;

public class Lab224_Try_CatchMultiple_IQ {
    public static void main(String[] args) {
        String name=null;
        try{
            System.out.println(name.trim());
            int a=10/0;
        }

        catch (NullPointerException|ArithmeticException e){
            System.out.println(e.getMessage());
        }

        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}

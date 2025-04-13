package ex_30_Exceptions;

public class Lab220_HandleException {
    public static void main(String[] args) {
        int a=0;
        try{
             a=10/a;
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}

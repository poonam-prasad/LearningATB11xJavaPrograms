package ex_30_Exceptions;

import java.util.Scanner;

public class Lab228_TryCatchFinally_Purpose {
    public static void main(String[] args) {
        Scanner sc=null;
        sc=new Scanner(System.in);
        int num=sc.nextInt();

        try{
            num=num/0;
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        finally {
            sc.close();
            System.out.println("Finally block will be always executed,sc closed");
        }
    }
}

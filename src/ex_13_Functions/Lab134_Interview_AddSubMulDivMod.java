package ex_13_Functions;

import java.util.Scanner;

public class Lab134_Interview_AddSubMulDivMod {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter first number ");

        int number1=0;
        int number2=0;
        if(scn.hasNextInt())
        {
             number1=scn.nextInt();
        }
        else{
            System.out.println("Enter Integer only");
            System.exit(0);
        }

        Scanner scn1=new Scanner(System.in);
        System.out.println("Enter second number ");
        if(scn1.hasNextInt())
        {
             number2=scn1.nextInt();

        }
        else{
            System.out.println("Enter Integer only");
            System.exit(0);
        }

        System.out.println("Addition is "+addition(number1,number2));
        System.out.println("Subtraction is "+ subtraction(number1,number2));
        System.out.println("Multiplication is "+multiplication(number1,number2));;
        System.out.println("Division is "+division(number1,number2));
        System.out.println("Remainder is "+modulus(number1,number2));
    }

    public static int addition(int number1,int number2)
    {
        return number1+number2;
    }

    public static int subtraction(int number1, int number2){
        return number1-number2;
    }
    public  static int multiplication(int number1,int number2){
        return number1*number2;
    }

    public  static int division(int number1,int number2) throws ArithmeticException{
        if(number2==0)
        {
            throw new ArithmeticException("Division by 0 Not Allowed");
        }
        return number1/number2;
    }
    public  static int modulus(int number1,int number2){
        return number1%number2;
    }



}

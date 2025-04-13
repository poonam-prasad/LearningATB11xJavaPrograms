package ex_30_Exceptions;

public class Lab217_Exceptions {
    public static void main(String[] args) {

        System.out.println("Starting the Program");
        String inputUser=args[0]; //ArrayIndexOutOfBoundsException
        int a=Integer.parseInt(inputUser); //NumberFormatException
        int result=100/a; //ArithmeticException

        System.out.println(result);
        System.out.println("Ending program");
    }
}



package Tasks;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner scn=new Scanner(System.in);
        System.out.println("Enter Fibonacci number");
        int fibonacciNumber=scn.nextInt();
        int nextNum=0;
        int firstNum=0;
        int secondNum=1;
        for(int i=1;i<=fibonacciNumber;i++)
        {
        System.out.print(firstNum+" ");
        //System.out.print(secondNum+" ");
         nextNum=firstNum+secondNum;
         firstNum=secondNum;
         secondNum=nextNum;


        }
    }
}

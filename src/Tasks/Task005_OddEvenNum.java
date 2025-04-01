package Tasks;
import java.util.Scanner;

public class Task005_OddEvenNum {
    public static void main(String[] args) {
        System.out.println("Enter any Number");
        Scanner scn=new Scanner(System.in);
        int number=scn.nextInt();

        //Input mismatch exception if input is wrong.

        if(number%2==0)
        {
            System.out.println("Number is EVEN "+number);
        }
        else{
            System.out.println("Number is ODD "+number);
        }

    }
}

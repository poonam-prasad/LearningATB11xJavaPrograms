package ex_11_While;

import java.util.Scanner;

public class Lab121_Factorial {
    public static void main(String[] args) {

        Scanner scn=new Scanner(System.in);
        System.out.println("Enter any Number for finding Factorial");
        int number=scn.nextInt();

        int factorial=1;

        if(number<=1)
        {
            System.out.println("Factorial is = "+factorial);
        }

        else {
            for(int i=1;i<=number;i++)
            {
                factorial=factorial*i;
            }
            System.out.println("Factorial is = "+factorial);
        }
    }
}

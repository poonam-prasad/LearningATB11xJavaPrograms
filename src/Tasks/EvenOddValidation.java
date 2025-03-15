package Tasks;

import java.util.Scanner;

public class EvenOddValidation {
    public static void main(String[] args) {

        Scanner scn=new Scanner(System.in);
        System.out.println("Please Enter any Number");

        int number=scn.nextInt();

        if(number%2==0){
            System.out.println("Its Even Number "+number);
        }
        else{
            System.out.println("Its Odd Number "+number);
        }
    }
}

package Tasks;

import java.util.Scanner;

public class Task009_FizzBuzz {

    public static void main(String[] args) {
     Scanner scn=new Scanner(System.in);
        System.out.println("Enter Fizz Biz number");
        int number= scn.nextInt();


            if(number%3==0 && number%5==0)
            {
                System.out.print("FizzBuzz");
            }
            else if(number%3==0)
            {
                System.out.print("Fizz");
            }
            else if(number%5==0)
            {
                System.out.print("Buzz");
            }
            else{
                System.out.println("Its not Fizz Buzz number");

        }
    }
}

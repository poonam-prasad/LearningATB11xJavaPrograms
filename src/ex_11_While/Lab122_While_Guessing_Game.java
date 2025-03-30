package ex_11_While;

import java.util.Random;
import java.util.Scanner;

public class Lab122_While_Guessing_Game {
    public static void main(String[] args) {

        Random random=new Random();
        int numberToGuess=random.nextInt(100)+1;

        Scanner scn=new Scanner(System.in);
        System.out.println("Enter any number");

        int guess;
        int attempts=0;

        while(true)
        {
            int number= scn.nextInt();
            attempts++;
            if(number<numberToGuess)
            {
                System.out.println("Too low");
            }
            else if(number>numberToGuess)
            {
                System.out.println("Too High");
            }

            else{
                System.out.println("You guessed it right "+number+"Attempts "+attempts);
                break;

            }
        }
    }
}

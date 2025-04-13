package ex_30_Exceptions;

import jdk.jshell.spi.ExecutionControl;

import java.util.Scanner;

public class Lab234_ThrowException2 {
    public static void main(String[] args) throws Exception {
        boolean canIgoGoa = true;
        System.out.println("Enter your age");
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        canIgoGoa=validateAge(num);
        if(canIgoGoa==false){
            System.out.println("You can't go your age is less than 18");
        }
        else{
            System.out.println("Yes, you can go to Goa!");
        }

    }

    static boolean validateAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("You can't go to Goa else you will be out of house");
        }

        else{
            return true;
        }


    }
}

package ex_09_SwitchCase;

import java.util.Scanner;

public class Lab_086_SwitchJava {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.println("Enter valid day");

        String day=scn.next();

        switch(day){

            case "Mon":
                System.out.println("Its Monday");
                break;

            case "Tue":
                System.out.println("Its Tuesday");
                break;

            default:
                System.out.println("Invalid day");
        }

    }
}

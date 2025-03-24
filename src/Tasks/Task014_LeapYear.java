package Tasks;

import java.util.Scanner;

public class Task014_LeapYear {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter Year");
        int year=scn.nextInt();


        if(year%4==0)
            System.out.println("Its Leap year "+year);
        else
            System.out.println("It not a Leap year "+year);



    }
}

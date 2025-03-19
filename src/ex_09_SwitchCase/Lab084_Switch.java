package ex_09_SwitchCase;

import java.util.Scanner;

public class Lab084_Switch {
    public static void main(String[] args) {
        System.out.println("Enter Day no");

        Scanner scn=new Scanner(System.in);
        int day=scn.nextInt();

        switch (day){
            case 1:System.out.println("Mon");
            break;

            case 2:System.out.println("Tue");
            break;

            case 3:System.out.println("Wed");
                break;

            case 4:System.out.println("Thursday");
                break;

            case 5:System.out.println("Friday");
                break;

            case 6:System.out.println("Saturday");
                break;
            default:
                System.out.println("no cases matched");

        }
    }
}

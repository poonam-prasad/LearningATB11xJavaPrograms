package ex_09_SwitchCase;

import java.util.Scanner;

public class Lab_087_SwitchCase_AutomationReal {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter Browser name");
        String browser=scn.next();

        switch (browser){
            case "chrome":
                System.out.println("Staring execution with Chrome browser");
                System.out.println("TC1 Executed");
                break;

            case "firefox":
                System.out.println("Staring execution with Firefox browser");
                System.out.println("TC1 Executed");
                break;

            case "edge":
                System.out.println("Staring execution with Edge browser");
                System.out.println("TC1 Executed");
                break;

            default:
                System.out.println("Invalid Browser");
                break;




        }
    }
}

package Tasks;

import java.util.Scanner;

public class UserInputNameAgeSalaryPrint {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);

        System.out.println("Enter your Name");
        String name=scn.next();

        System.out.println("Enter your Age");
        int age=scn.nextInt();

        System.out.println("Enter your Salary");
        int salary=scn.nextInt();

        System.out.println("Your Name is "+name);
        System.out.println("Your Age is "+age);
        System.out.println("Your Salary is "+salary);

    }
}

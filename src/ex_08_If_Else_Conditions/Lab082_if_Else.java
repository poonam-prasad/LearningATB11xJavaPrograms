package ex_08_If_Else_Conditions;
import java.util.Scanner;

public class Lab082_if_Else {
    public static void main(String[] args) {
        System.out.println("Enter your age");

        Scanner scn=new Scanner(System.in);
        int age=scn.nextInt();

        if(age>18)
        {
            System.out.println("Yes You can Vote");
        }
        else{
            System.out.println("No, You can't Vote");
        }

    }
}

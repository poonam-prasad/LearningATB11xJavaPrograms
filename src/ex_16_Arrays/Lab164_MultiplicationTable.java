package ex_16_Arrays;

import java.util.Scanner;

public class Lab164_MultiplicationTable {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter Size of Matrix Array");
        int arraySize=scn.nextInt();

        for(int i=0;i<arraySize;i++)
        {
            for(int j=0;j<arraySize;j++)
            {
                System.out.print(i+"*"+j+"="+(i*j)+" | ");
            }
            System.out.println();


        }
    }
}

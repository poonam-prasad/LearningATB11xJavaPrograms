package ex_16_Arrays;

import java.util.Scanner;

public class Lab165_LeftTriangle {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter Array Size");
        int arraySize=scn.nextInt();

        for(int i=0;i<arraySize;i++)
        {
            for(int j=arraySize-1;j>=i;j--){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}

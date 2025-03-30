package ex_16_Arrays;

import java.util.Scanner;

public class Lab154_Array_User_Input {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Array Size ");

        int arraySize = scn.nextInt();

        int[] marksArray = new int[arraySize];

        System.out.println("Enter the numbers");
        Scanner num = new Scanner(System.in);
        for (int i = 0; i < arraySize; i++) {
            marksArray[i]=num.nextInt();
        }

        for (int i = 0; i < marksArray.length; i++) {
            System.out.println(marksArray[i]);
        }
    }
}

package Tasks;

import java.util.Scanner;

public class Task016_Array_2D_SecondLargest {
    public static void main(String[] args) {
        int row,column;
        //Getting no of Rows & Columns from user input
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter No of Rows in Array");
        row=scn.nextInt();

        Scanner scn1=new Scanner(System.in);
        System.out.println("Enter No of Columns in Array");
        column=scn.nextInt();

        //User input for elements of Array
        Scanner scn2=new Scanner(System.in);
        //declare the array
        int array[][]=new int[row][column];

        //enter elements into array
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                System.out.print("Element at ["+ i + "]" + "[" + j + "]: ");
                array[i][j]=scn2.nextInt();
            }
        }

        //printing the 2D Array
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }

        int max=0;
        int second_largest=0;

        for(int i=0;i<row;i++) {
            for (int j = 0; j < column; j++) {
                if (array[i][j] > max) {
                    second_largest = max;//second largest before max
                    max = array[i][j];

                } else if (array[i][j] > second_largest && array[i][j] != max) {
                    second_largest = array[i][j];
                }
            }
        }
            System.out.println("Second largest no "+second_largest);
            System.out.println("Max number "+max);


    }
}

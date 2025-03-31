package Tasks;

import java.util.Scanner;

public class Task017_OddEvenArray1D {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter size of array");
        int size=scn.nextInt();
        int array[]=new int[size];
        Scanner scn1=new Scanner(System.in);
        for(int i=0;i<size;i++)
        {
            System.out.println("Enter elements of array [i]:");
            array[i]=scn1.nextInt();
        }
        for(int i=0;i<size;i++)
        {
            System.out.println(array[i]);
        }

        for(int i=0;i<size;i++)
        {
            if(array[i]%2==0)
                System.out.println("Even no is array "+array[i]);
            else
                System.out.println("Odd no is array "+array[i]);
        }

    }
}

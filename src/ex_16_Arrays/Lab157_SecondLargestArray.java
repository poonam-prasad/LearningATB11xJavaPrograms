package ex_16_Arrays;

import java.util.Arrays;

public class Lab157_SecondLargestArray {
    public static void main(String[] args) {
        int array1[]={10,30,20,40,50};

        Arrays.sort(array1);
        System.out.println(array1[array1.length-2]);
        System.out.println(array1[array1.length-3]);
    }
}

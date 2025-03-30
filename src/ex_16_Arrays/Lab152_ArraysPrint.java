package ex_16_Arrays;

import java.util.Arrays;

public class Lab152_ArraysPrint {
    public static void main(String[] args) {
        String [] names={"Poonam","Amit","Myra"};
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println("-------------");
        //Using for loop to print

        for(int i=0;i<names.length;i++)
        {
            System.out.println(names[i]);
        }

        Arrays.sort(names);

        for(int i=0;i<names.length;i++)
        {
            System.out.println(names[i]);
        }
    }
}

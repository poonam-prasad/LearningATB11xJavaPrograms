package ex_16_Arrays;

import javax.crypto.spec.PSource;

public class Lab151_ArraysPart2 {
    public static void main(String[] args) {
        String names[]=new String[5];
        names[0]="Poonam";
        names[1]="Myra";
        System.out.println(names[0]);
        System.out.println(names.length);

        int marks[]={40,50,100};
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks.length);

        boolean[] isMarried=new boolean[2];
        isMarried[0]=true;
        isMarried[1]=false;
        System.out.println(isMarried[0]);

    }
}

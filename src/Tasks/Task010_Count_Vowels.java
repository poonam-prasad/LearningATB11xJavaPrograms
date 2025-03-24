package Tasks;

import java.util.Scanner;

public class Task010_Count_Vowels {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter your Name in Uppercase");
        String name=scn.next();
        int count=0;

        for(int i=0;i<name.length();i++)
        {
            if(name.charAt(i)=='A'||name.charAt(i)=='E' ||name.charAt(i)=='I'||name.charAt(i)=='O'||name.charAt(i)=='U')
            {
                System.out.print(name.charAt(i) +" ");
                count++;
            }


        }System.out.println("Total vowel count= "+count);
    }
}

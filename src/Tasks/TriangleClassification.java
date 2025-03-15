package Tasks;

import java.util.Scanner;

public class TriangleClassification {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.println("Please enter length of first side of triangle");
        int length1=scn.nextInt();

        System.out.println("Please enter length of second side of triangle");
        int length2=scn.nextInt();

        System.out.println("Please enter length of third side of triangle");
        int length3=scn.nextInt();

        if(length1==length2 && length1==length3){
            System.out.println("Its an Equilateral triangle since all sides are equal"+length1+" "+length2+" "+length3);
        }
        else if(length1==length2 || length1==length3 || length2==length3 )
        {
            System.out.println("Its an Isosceles triangle since two sides are equal"+length1+" "+length2+" "+length3);
        }

        else{
            System.out.println("Its a Scalene triangle since all sides are unequal"+length1+" "+length2+" "+length3);
        }
    }
}

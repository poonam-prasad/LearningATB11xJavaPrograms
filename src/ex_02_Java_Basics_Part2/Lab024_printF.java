package ex_02_Java_Basics_Part2;

public class Lab024_printF {
    public static void main(String[] args) {

        // %d for short,byte,int,long datatypes
        // %f for float & double
        // %s for String datatype
        // %b for boolean

        int a=10;
        float b=20.30f;
        String name="Poonam";
        boolean flag=true;

        System.out.printf("%d \t %f \t %s \t %b",a,b,name,flag);
    }
}

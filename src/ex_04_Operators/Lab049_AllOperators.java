package ex_04_Operators;

public class Lab049_AllOperators {
    public static void main(String[] args) {
        boolean b1=true;
        int a=20,b=10;

        System.out.println(a > b); // true
        System.out.println(a >= b); // true
        System.out.println(a == b); //false
        System.out.println(a != b);  //true

        //Arithmetic Operators -> +,-,*,/,%
        System.out.println(a+b); // 30
        System.out.println(a-b); // 10
        System.out.println(a*b); // 200
        System.out.println(a/b); // 2
        System.out.println(a%b); // 0

        //Compound Assignment operators
        // +=,-=,*=,/=
        System.out.println(a+=2); //a=a+2=20+2=22
        System.out.println(a-=2); //a=a-2=22-2=20
        System.out.println(a*=2); //a=a*2=20*2=40
        System.out.println(a/=2); //a=a/2=40/2=20

        //Relational Operators-->For comparing two values
        // >,<,>=,<=,!=,==

        //Logical Operators
        //&& AND, || OR, ! NOT

        //Bitwise operators--Digital electronics
        //~ Bitwise Not
        // >> Right shift
        // << left shift
        // ^ XOR

        }
}

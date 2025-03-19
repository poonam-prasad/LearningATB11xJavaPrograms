package ex_07_Increment_Decrement_Operator;

public class Lab071_POST_ID {
    public static void main(String[] args) {
        int a= 10;
        System.out.println(++a); //a=11
        System.out.println(a); //a=11

        // POST increment  = Print first and then increase
        int a_post = 10;
        System.out.println(a_post++); //a_post=10
        System.out.println(a_post); //a_post=11

    }
}

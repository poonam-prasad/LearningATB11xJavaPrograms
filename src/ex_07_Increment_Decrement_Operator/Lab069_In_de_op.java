package ex_07_Increment_Decrement_Operator;

public class Lab069_In_de_op {
    public static void main(String[] args) {
        String age_string=args[0];
        String a1=args[1];
        String a2=args[2];
        String a3=args[3];
        String a4=args[4];
        //String a5=args[5]; //ArrayIndexOutOfBoundsException

        int age=Integer.parseInt(age_string);

        System.out.println(age_string);
        System.out.println(a1+" "+a2+" "+a3+" "+a4);

    }
}

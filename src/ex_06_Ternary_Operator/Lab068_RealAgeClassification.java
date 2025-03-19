package ex_06_Ternary_Operator;

public class Lab068_RealAgeClassification {
    public static void main(String[] args) {

        String age=args[0];
        System.out.println(age);

        int age1=Integer.parseInt(age);

        String ageClassification=(age1<18)?"Minor": age1<65?"Adult":"Senior";

        System.out.println(ageClassification);

    }
}

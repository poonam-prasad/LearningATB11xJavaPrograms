package ex_06_Ternary_Operator;

public class Lab065_Max_TO_Math {
    public static void main(String[] args) {
        int x=10;
        int y=20;

        int max=Math.max(x,y);
        System.out.println(max);

        int max1=(x>y)?x:y;
        System.out.println(max1);

    }
}

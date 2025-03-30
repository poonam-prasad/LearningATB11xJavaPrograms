package ex_13_Functions;

public class Lab131_UserDefined_CalSum {
    public static void main(String[] args) {
        int result=sum(10,20);
        int result1=sum(100,400);
        System.out.println(result);
        System.out.println(result1);
    }

    public static int sum(int a,int b)
    {
        return a+b;
    }
}

package Tasks.Tasks022;

public class MethodOverLoading {
    public static void main(String[] args) {

        System.out.println(sum(10,20));
        System.out.println(sum(10.5f, 10.5f));
        System.out.println(sum(10,20,30));

    }


    static int sum(int a, int b) {
        return a + b;
    }

    static float sum(float a, float b) {
        return a + b;
    }

    static int sum(int a, int b,int c) {
        return a + b+ c;
    }


}


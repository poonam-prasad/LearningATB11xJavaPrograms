package Tasks;

public class Math_Functions {
    public static void main(String[] args) {
        int x=10;
        int y=10;
        int z=10;

        double result=Math.cbrt(Math.pow(x,2)+Math.pow(y,2)-Math.abs(z));
        System.out.println(result);
    }
}

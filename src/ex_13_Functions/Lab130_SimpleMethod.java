package ex_13_Functions;

public class Lab130_SimpleMethod {
    public static void main(String[] args) {

        no_return();
        System.out.println(return_Int());
        System.out.println(return_char());
        System.out.println(return_char());
        System.out.println(return_String());
        System.out.println(return_boolean());
        System.out.println(return_byte());
        System.out.println(return_float());
        System.out.println(return_long());
    }

    public static void no_return()
    {
        System.out.println("No return");
    }

    public static int return_Int()
    {
        return 10;
    }

    public static char return_char()
    {
        return 'A';
    }

    public static String return_String()
    {
        return "Hello String";
    }

    public static boolean return_boolean()
    {
        return true;
    }

    public static byte return_byte()
    {
        return 100;
    }

    public static float return_float()
    {
        return 10.10f;
    }

    public static long return_long()
    {
        return 121323232;
    }
}

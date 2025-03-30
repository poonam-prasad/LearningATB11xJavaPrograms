package ex_13_Functions;

public class Lab132_UserDefined_FunctionTypes {
    public static void main(String[] args) {
        greet();
        System.out.println(greetWithDetails());
        greetFullName("Poonam","Prasad");
        System.out.println(calSum(10,40));
    }
    //Without parameters and without Return type
    public static void greet()
    {
        System.out.println("Hello");
    }
    //Without parameters but with Return Type
    public static String greetWithDetails()
    {
        return "Hello"+" Everyone";
    }
    //With parameters but without Return type
    public static void greetFullName(String fName,String lName)
    {
        System.out.println("Hello,Your first Name is "+fName+" Your surname is "+lName);
    }
    //With parameters and with Return Type
    public static int calSum(int a, int b)
    {
        return a+b;
    }

}

package Tasks;

public class UserInputMaxNoTernary {
    public static void main(String[] args) {

       int number1=Integer.parseInt(args[0]);
       int number2=Integer.parseInt(args[1]);

       String maxNumber=(number1>number2)?"number1 is maximum number":"number2 is maximum number";
       System.out.println(maxNumber);

    }
}

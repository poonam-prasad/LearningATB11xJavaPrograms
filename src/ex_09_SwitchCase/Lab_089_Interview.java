package ex_09_SwitchCase;

public class Lab_089_Interview {
    public static void main(String[] args) {
        char ch='A';

        switch (ch)
        {
            case 65:
                System.out.println("ASCII  value of A is 65");
                break;

           /* case 'A':
                System.out.println("Its character A");
                break;*/

            default:
                System.out.println("Invalid details");
        }
    }
}

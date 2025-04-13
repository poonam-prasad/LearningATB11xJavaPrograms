package ex_30_Exceptions;

public class Lab229_Jr_QA_Sr_QA_3 {
    public static void main(String[] args) {
        try {
            String name = null;
            name = args[0];
            int newNum = Integer.parseInt(name);
            newNum = newNum / 0;
        }
        catch (ArrayIndexOutOfBoundsException|NumberFormatException|ArithmeticException e){
            System.out.println(e.getMessage());
        }

    }
}

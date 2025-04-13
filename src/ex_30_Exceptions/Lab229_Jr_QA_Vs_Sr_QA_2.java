package ex_30_Exceptions;

public class Lab229_Jr_QA_Vs_Sr_QA_2 {
    public static void main(String[] args) {
        String name=null;
        try {
            String name1 = args[0];
            int newNum = Integer.parseInt(name);
            newNum = newNum / 0;
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}

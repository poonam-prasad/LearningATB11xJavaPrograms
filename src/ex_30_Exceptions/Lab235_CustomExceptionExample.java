package ex_30_Exceptions;

public class Lab235_CustomExceptionExample {
    public static void main(String[] args) {

        Bank sbi=new Bank("INR",123);
        Bank icici=new Bank("INR",200);
        Bank jpmc=new Bank("USD",200);

       // int total=sbi.addAmount(icici);
        int total=sbi.addAmount(jpmc);
        System.out.println(total);


    }
}

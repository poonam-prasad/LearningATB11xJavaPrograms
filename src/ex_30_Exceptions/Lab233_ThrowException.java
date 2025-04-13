package ex_30_Exceptions;

public class Lab233_ThrowException {
    public static void main(String[] args) throws Exception {
    divideByZero(0);

    }

    public static void divideByZero(int a) throws Exception {
        int num=a;
    if(num==0){
        throw new ArithmeticException("Divide by Zero");
    }
    }
}
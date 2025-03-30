package ex_15_StringBuffer_StringBuilder_StringFunctions;

public class Lab144_StringBuilder_StringBuffer {
    public static void main(String[] args) {
        String s1="Poonam";
        String s2=new String("Amit");

        StringBuffer s3=new StringBuffer("Poonam");
        StringBuilder s4=new StringBuilder("Amit");

        System.out.println(s1+"\t"+s2+"\t"+s3+"\t"+s4);
    }
}

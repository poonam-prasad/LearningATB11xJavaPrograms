package ex_15_StringBuffer_StringBuilder_StringFunctions;

public class Lab148_StringBufferP1 {
    public static void main(String[] args) {
       StringBuffer stringBuffer=new StringBuffer("Java");
        System.out.println(stringBuffer.append(" Programming"));
        System.out.println(stringBuffer.delete(0,3));
        System.out.println(stringBuffer.replace(0,3,"c++"));


    }
}

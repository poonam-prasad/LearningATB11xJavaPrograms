package ex_03_Literals;

import java.net.StandardSocketOptions;

public class Lab033_BinaryOctalHexadecimal {
    public static void main(String[] args) {
        //Binary literal for 10
        int binaryNo=0b1010;

        //Octal base --8
        int octalNum=0101;

        //Hexadecimal -- 16
        //base 16 color combination are in hex - #28a745
        int hexaNum=0Xface;

        System.out.println(binaryNo+" "+octalNum+" "+hexaNum);
    }
}

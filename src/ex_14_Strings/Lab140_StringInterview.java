package ex_14_Strings;

public class Lab140_StringInterview {
    public static void main(String[] args) {
        String s1="Hello"; //Created in SCP , Only 1 "Hello" string will be Created since Duplicates not allowed in SCP
        String s2="Hello"; //Created in SCP
        String s3="Hello";//Created in SCP

        String o1=new String("Hello"); //Created in Object Area, 3 Strings created since new operator always creates new string
        String o2=new String("Hello"); //Created in Object Area
        String o3=new String("Hello");  //Created in Object Area
    }
}

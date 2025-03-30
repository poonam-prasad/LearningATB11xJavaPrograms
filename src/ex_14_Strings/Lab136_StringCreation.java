package ex_14_Strings;

public class Lab136_StringCreation {
    public static void main(String[] args) {
        String name="Poonam"; // String created in SCP String Constant Pool
        String s1=new String("Poonam"); //String created in Object Area
        System.out.println(name);
        System.out.println(s1);

    }
}

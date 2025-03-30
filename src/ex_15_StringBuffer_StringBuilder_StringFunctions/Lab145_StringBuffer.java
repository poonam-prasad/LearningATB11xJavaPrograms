package ex_15_StringBuffer_StringBuilder_StringFunctions;

public class Lab145_StringBuffer {
    public static void main(String[] args) {
        StringBuffer s1=new StringBuffer("Poonam");
        s1.append(" Prasad");  //Previous string deleted & only new appended string present since String Buffer Mutable in nature
        System.out.println(s1);

        s1.reverse();
        System.out.println(s1);
    }
}

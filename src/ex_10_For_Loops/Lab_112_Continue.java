package ex_10_For_Loops;

public class Lab_112_Continue {
    public static void main(String[] args) {
        for(int i=1;i<10;i++) {
            if (i == 5)
            { continue;}

            System.out.println(i);
        }
    }
}

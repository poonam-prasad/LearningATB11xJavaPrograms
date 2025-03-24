package ex_10_For_Loops;

public class Lab_113_Continue_Even_Odd {
    public static void main(String[] args) {
        for(int i=1;i<10;i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println("Odd " + i);
        }
    }
}

package ex_10_For_Loops;

public class Lab_111_ForLoop_Break {
    public static void main(String[] args) {
        for(int i=1;i<10;i++)
        {
            if(i==5)
                break;
            else
                System.out.println(i);
        }
    }
}

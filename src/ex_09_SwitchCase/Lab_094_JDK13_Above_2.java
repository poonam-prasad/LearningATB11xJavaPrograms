package ex_09_SwitchCase;

public class Lab_094_JDK13_Above_2 {
    public static void main(String[] args) {
        int itemCode=001;

        switch (itemCode){
            case 001,002,003:
                System.out.println("Electronic gadgets");
                break;

            case 004,005,006:
                System.out.println("Musical gadgets");
                break;
        }
    }
}

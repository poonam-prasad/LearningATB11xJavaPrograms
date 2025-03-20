package ex_09_SwitchCase;

public class Lab095_Interview {
    public static void main(String[] args) {
        int a = 11;
        switch (-1){
            default:
                System.out.println("Default");
                break;
            case -1:
                System.out.println("10");  //10 will be printed
                break;
            case 9:
                System.out.println("9");
                break;
        }
    }
}

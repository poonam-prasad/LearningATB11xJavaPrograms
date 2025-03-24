package ex_10_For_Loops;

public class Lab102_For_No_Condition {
    public static void main(String[] args) {

        for(int i=1;;i++) //No Condition so always true so will go in Infinite loop
        {
            System.out.println(i);
        }
    }// exit code 130 (Stop by Yourself- Kill) Red Button - interrupted by signal
    // exit code 0 - Successful
}

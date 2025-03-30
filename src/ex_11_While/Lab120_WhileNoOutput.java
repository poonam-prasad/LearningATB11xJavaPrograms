package ex_11_While;

public class Lab120_WhileNoOutput {
    public static void main(String[] args) {
        int i=0;
        while(i<0) //Condition false so will not enter loop
        {
            System.out.println("Hello");
            i++;
        }
    }
}

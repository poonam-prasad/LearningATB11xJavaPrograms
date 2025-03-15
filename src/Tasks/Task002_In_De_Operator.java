package Tasks;

public class Task002_In_De_Operator
{
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + a++ + a++); //11+11+12=34
        System.out.println(a);
    }
}

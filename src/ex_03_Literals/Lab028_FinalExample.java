package ex_03_Literals;

public class Lab028_FinalExample {
    public static void main(String[] args) {
         int num=10;
          num=20;
          System.out.println(num);

         final float pi=3.141f;
         //pi=23.21f; //final variable cannot be reinitialized;

        System.out.println(pi);
    }
}

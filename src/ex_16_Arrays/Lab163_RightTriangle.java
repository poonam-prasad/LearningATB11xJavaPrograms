package ex_16_Arrays;

public class Lab163_RightTriangle {
    public static void main(String[] args) {
        int rightTriangleArray[][]=new int[5][5];
        for(int i=0;i<rightTriangleArray.length;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}

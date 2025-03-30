package ex_16_Arrays;

public class Lab159_2D_Array {
    public static void main(String[] args) {
        int array2D[][];
         array2D=new int [][]{{1,2,3},{4,5,6},{7,8,9}};

         int array2Dnew[][]=new int[3][3];
        array2Dnew[0][0]=1;
        array2Dnew[0][1]=2;
        array2Dnew[0][2]=3;

        array2Dnew[1][0]=4;
        array2Dnew[1][1]=5;
        array2Dnew[1][2]=6;

        array2Dnew[2][0]=7;
        array2Dnew[2][1]=8;
        array2Dnew[2][2]=9;

        System.out.println(array2Dnew[0][0]+"\t"+array2Dnew[0][1]+"\t"+array2Dnew[0][2]);
        System.out.println(array2Dnew[1][0]+"\t"+array2Dnew[1][1]+"\t"+array2Dnew[1][2]);
        System.out.println(array2Dnew[2][0]+"\t"+array2Dnew[2][1]+"\t"+array2Dnew[2][2]);



    }
}

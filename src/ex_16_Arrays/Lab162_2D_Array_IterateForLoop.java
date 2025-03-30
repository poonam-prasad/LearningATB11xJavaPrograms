package ex_16_Arrays;

public class Lab162_2D_Array_IterateForLoop {
    public static void main(String[] args) {
        int matrixArray[][]={{1,2,3},{4,5,6},{7,8,9}};

        for(int i=0;i<matrixArray.length;i++)
        {
            for(int j=0;j<matrixArray[i].length;j++)
            {
                System.out.print(matrixArray[i][j]+" | ");
            }
            System.out.println();
        }
    }
}

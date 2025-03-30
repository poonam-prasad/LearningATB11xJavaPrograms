package ex_16_Arrays;

public class Lab153_Arrays_Max_Min {
    public static void main(String[] args) {
        int marks[]={50,40,70,50,45};

        int maxNumber=findMax(marks);
        int minNumber=findMin(marks);

        System.out.println("Maximum no is "+maxNumber);
        System.out.println("Minimum no is "+minNumber);
    }

    public static int findMax(int[] array)
    {
        int maxNo=array[0];

        for(int i=0;i<array.length;i++)
        {
            if(array[i]>maxNo)
                maxNo=array[i];


        }return maxNo;
    }

    public static int findMin(int[] array)
    {
        int minNo=array[0];
        for(int i=0;i<array.length;i++)
        {
            if(array[i]<minNo)
                minNo=array[i];

        } return minNo;
    }
}

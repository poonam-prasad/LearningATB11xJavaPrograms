package ex_16_Arrays;

public class Lab156_SumOfArrays {
    public static void main(String[] args) {
        int []marks={10,20,30};
        int sum=0;

        for(int i=0;i<marks.length;i++)
        {
            sum=sum+marks[i];
        }
        System.out.println("Sum is "+sum);
        System.out.println("-------------");
        int sum1=0;
        //for each loop
        for(int array:marks)
        {
            sum1=sum1+array;
        }
        System.out.println("Sum is "+sum1);
    }
}

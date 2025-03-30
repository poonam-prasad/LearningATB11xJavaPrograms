package Tasks;

public class Task_SecondLargestArray_IfElse {
    public static void main(String[] args) {
        int max=0;
        int second_largest=0;

        int[] numbers={10,30,20,50,40};

       for(int i=0;i< numbers.length-1;i++)
       {
           if(numbers[i]>max)
           {
               max=numbers[i];
               second_largest=max;
           }

           else if(second_largest>numbers[i] && numbers[i]!=max)
           {
                second_largest=numbers[i];
           }
       }

    }
}

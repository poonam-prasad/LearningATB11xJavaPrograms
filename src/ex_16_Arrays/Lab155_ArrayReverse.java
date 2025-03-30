package ex_16_Arrays;

public class Lab155_ArrayReverse {
    public static void main(String[] args) {
        int[] marks={10,20,30,40,50};

        for(int i=marks.length-1;i>=0;i--)
        {
            System.out.print(marks[i]+"\t");
        }
    }
}

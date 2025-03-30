package ex_16_Arrays;

public class Lab150_Arrays2 {
    public static void main(String[] args) {
        int [] marks={1,3,3,4,5};

        String[] names=new String[5]; //Fixed size
        int [] studentMarks=new int[5]; //Fixed size

        names[0]="Poonam";
        names[1]="Amit";

        studentMarks[3]=50;

        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[4]);

        System.out.println(studentMarks[3]);
        System.out.println(studentMarks[0]);
    }
}

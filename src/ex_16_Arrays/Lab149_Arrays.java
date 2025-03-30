package ex_16_Arrays;

public class Lab149_Arrays {
    public static void main(String[] args) {
        int a=10;
        int [] marks={40,50,50,100,60};
        boolean [] isMarried={true,false,true};

        System.out.println(marks.length); //length is property here
        System.out.println(marks[1]);
        System.out.println(marks[4]);
        System.out.println(isMarried[2]);
        //System.out.println(marks[-1]);//Array index Out of Bound exception
    }
}

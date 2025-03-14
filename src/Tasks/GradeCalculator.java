package Tasks;

public class GradeCalculator {

    public static void main(String[] args) {

        String marks=args[0];
        int intMarks=Integer.parseInt(marks);

        String grade=(intMarks>=90 && intMarks<100)?"Grade is A":(intMarks>=80 && intMarks<90)?"Grade is B":(intMarks>=70 && intMarks<80)?"Grade is C":(intMarks>=60 && intMarks<70)?"Grade is D":"Grade is F Fail";

        System.out.println("Marks is "+intMarks+" "+grade);
    }
}

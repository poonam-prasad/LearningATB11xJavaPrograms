package ex_28_Enum;

public class Lab210_Enum {
    public static void main(String[] args) {
    DaysString day1=new DaysString();
        System.out.println(day1.days[6]);
        System.out.println(Days.Sat);
    }
}

class DaysString{
    String[] days={"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};
}
enum Days{
    Sun,Mon,Tue,Wed,Thu,Fri,Sat;
}
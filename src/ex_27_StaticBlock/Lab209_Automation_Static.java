package ex_27_StaticBlock;

import java.sql.SQLOutput;

public class Lab209_Automation_Static {
    public static void main(String[] args) {
        System.out.println(Automation.driver);
        Automation ref1=new Automation();
        System.out.println(ref1.driver);

    }
}

class Automation{
    static String driver="chrome";
}
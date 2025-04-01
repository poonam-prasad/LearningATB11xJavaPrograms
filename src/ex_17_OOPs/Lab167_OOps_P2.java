package ex_17_OOPs;

public class Lab167_OOps_P2 {
    public static void main(String[] args) {
        Student s1=new Student();
        //Student --> Class Loading
        // s1 -->Object reference
        // new Student() -->Object

        s1.name="Poonam";
        s1.sleep();
        s1.rollNo=1;
        System.out.println(s1.name);
        System.out.println(s1.rollNo);
    }
}

class Student{
    String name;
    int rollNo;

    void sleep()
    {
        System.out.println("Student sleeping");
    }
}

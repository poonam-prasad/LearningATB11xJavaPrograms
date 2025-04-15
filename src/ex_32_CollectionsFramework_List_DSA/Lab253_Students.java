package ex_32_CollectionsFramework_List_DSA;

import java.util.ArrayList;

public class Lab253_Students  {

    public static void main(String[] args) {
        Students s1=new Students("Poonam",30);
        Students s2=new Students("Amit",35);
        Students s3=new Students("Myra",11);

        ArrayList studentsList=new ArrayList();
        studentsList.add(s1);
        studentsList.add(s2);
        studentsList.add(s3);

        System.out.println(studentsList);
    }
}

package ex_32_CollectionsFramework_List_DSA.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab256_Comparable {
    public static void main(String[] args) {

        Student s1=new Student(003,"Myra",11);
        Student s2=new Student(001,"Poonam",30);
        Student s3=new Student(002,"Amit",35);

        List students=new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);

        System.out.println(students);
        Collections.sort(students);
        System.out.println(students);

    }
}

class Student implements Comparable<Student>{
    private int rollNo;
    private String name;
    private int age;

    Student(int rollNo,String name,int age){
        this.rollNo=rollNo;
        this.name=name;
        this.age=age;
    }

    /*public int compareTo(Student o){
        return this.rollNo-o.rollNo;
    }*/

   /* public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }*/

    public int compareTo(Student o){
        return this.age-o.age;
    }

   public String toString(){
        return "{"+"rollNo="+this.rollNo+","+"name="+this.name+","+"age="+this.age+"}";
    }
}
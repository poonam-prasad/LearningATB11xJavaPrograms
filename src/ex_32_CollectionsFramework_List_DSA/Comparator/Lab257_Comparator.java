package ex_32_CollectionsFramework_List_DSA.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Lab257_Comparator {
    public static void main(String[] args) {

        Students1 s1=new Students1("Poonam",001,25);
        Students1 s2=new Students1("Amit",003,25);
        Students1 s3=new Students1("Myra",002,11);

        List studentsList=new ArrayList<>();
studentsList.add(s1);
studentsList.add(s2);
studentsList.add(s3);
        System.out.println(studentsList);

        Collections.sort(studentsList,new NameComparator());
        System.out.println(studentsList);
    }
}

class Students1 {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo(){
        return this.rollNo;
    }

    public  void setRollNo(int rollNo){
        this.rollNo=rollNo;
    }

    public int getAge(){
        return this.age=age;
    }

    public void setAge(int age){
        this.age=age;
    }

    private String name;
    private int rollNo;
    private int age;

    Students1(String name,int rollNo,int age){
        this.name=name;
        this.rollNo=rollNo;
        this.age=age;
    }

    public String toString(){
        return "{"+"name="+this.name+","+"rollNo="+this.rollNo+"age="+","+this.age+"}";
    }

}

class AgeComparator implements Comparator<Students1>{
    public int compare(Students1 s1, Students1 s2){
        return s1.getAge()-s2.getAge();
    }
}

class RollNoComparator implements Comparator<Students1>{
    public int compare(Students1 s1,Students1 s2){
        return s1.getRollNo()-s2.getRollNo();
    }
}

class NameComparator implements Comparator<Students1>{
    public int compare(Students1 s1,Students1 s2){
        return s1.getName().compareTo(s2.getName());
    }
}
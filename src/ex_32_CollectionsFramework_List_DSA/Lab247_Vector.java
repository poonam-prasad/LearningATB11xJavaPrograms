package ex_32_CollectionsFramework_List_DSA;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Lab247_Vector {
    public static void main(String[] args) {
        Vector vector=new Vector(10);
        Vector v=new Vector();
        v.add("Poonam");
        v.add("Amit");
        v.add("Myra");
        v.add("Test");

        System.out.println(v);
        v.remove("Test");
        System.out.println(v);

        //for loop
        for(int i=0;i<v.size();i++){
            System.out.println(v.get(i));
        }

        //for each loop
        for(Object o:v){
            System.out.println(o);
        }

        //Iterator
        System.out.println("Iterator----");
        Iterator iterator=v.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("-------------");

        //Enumeration
        System.out.println("Enumeration-----");
        Enumeration elements=v.elements();
        while (elements.hasMoreElements()){
            System.out.println(elements.nextElement());
        }
        System.out.println("----------------");

        //ListIterator
        System.out.println("List Iterator------");
        ListIterator listIterator=v.listIterator();
        while(listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
        System.out.println("--------------");

        System.out.println("List iterator Reverse----");
        while(listIterator.hasPrevious())
        {
            System.out.println(listIterator.previous());
        }


    }
}

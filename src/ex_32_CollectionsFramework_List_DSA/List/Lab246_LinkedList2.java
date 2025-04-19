package ex_32_CollectionsFramework_List_DSA.List;

import java.util.*;

public class Lab246_LinkedList2 {
    public static void main(String[] args) {
        ArrayList list=new ArrayList(5);

        List mylist2=new LinkedList();
        mylist2.add("Pramod");
        mylist2.add("Dutta");
        mylist2.add("Amit");
        mylist2.add("meenu");
        mylist2.add("ritwik");
        mylist2.add("ritwik");
        mylist2.add(null); //null also allowed
        mylist2.add(true);
        mylist2.add(123);

        System.out.println(mylist2);
        System.out.println(mylist2.size());
        System.out.println(mylist2.contains(123));
        System.out.println(mylist2.indexOf("Amit"));

        //for loop
        for(int i=0;i<mylist2.size();i++){
            System.out.println(mylist2.get(i));
        }
        //for each loop
        for(Object o:mylist2){
            System.out.println(o);
        }
        //Iterator
        Iterator iterator=mylist2.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //List Iterator
        ListIterator listIterator=mylist2.listIterator();
        while(listIterator.hasNext()){
            System.out.println(listIterator.next());
        }

        //Reverse
       /* while(listIterator.hasPrevious()){
            System.out.println(listIterator.hasPrevious());
        }*/


        //Enumeration


    }
}

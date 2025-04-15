package ex_32_CollectionsFramework_List_DSA.SET;

import java.util.*;

public class Lab255_SetClasses {
    public static void main(String[] args) {

        Set fruits1=new HashSet();
        //Hashset: Hashing mechanism to store elements, No duplicates, No ordered storage

        fruits1.add("Apple");
        fruits1.add("Apple");
        fruits1.add("apple");
        fruits1.add("Watermelon");
        fruits1.add("Orange");
        fruits1.add(null);

        System.out.println("Hashset "+fruits1);

        Set fruits2=new LinkedHashSet();
        //LinkedHashSet: Linked mechanism to store elements, Ordered collection, No duplicates, only 1 Null allowed
        fruits2.add("Apple");
        fruits2.add("Apple");
        fruits2.add("apple");
        fruits2.add("Watermelon");
        fruits2.add("Orange");

        System.out.println("LinkedHashSet "+fruits2);

        Iterator iterator=fruits2.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println(fruits2.size());
        System.out.println(fruits2.isEmpty());
        System.out.println(fruits2.contains("watermelon"));

        Set fruits3=new TreeSet();
        //TreeSet: Black & Red tree mechanism to store elements, Order maintained,Natural sorting
        fruits3.add("Apple");
        fruits3.add("Apple");
        fruits3.add("apple");
        fruits3.add("Watermelon");
        fruits3.add("Orange");
        //fruits3.add(123); //ClassCast Exception
       // fruits3.add(null); //Null is not allowed,Null pointer exception

        System.out.println("Treeset "+fruits3);

        for(Object o:fruits3){
            System.out.println(o);
        }

    }
}

package ex_32_CollectionsFramework_List_DSA;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Lab249_NestedArrayList {
    public static void main(String[] args) {

        List fruits1=new ArrayList();
        fruits1.add("mango");
        fruits1.add("apple");
        fruits1.add("banana");

        List fruits2=new ArrayList();
        fruits2.add("pear");
        fruits2.add("chiku");

        List veg=new ArrayList();
        veg.add("peas");
        veg.add("cabbage");
        veg.add("potato");

        List list=new ArrayList();

        list.add(fruits1);
        list.add(fruits2);
        list.add(veg);

        System.out.println(list);
        System.out.println(list.get(2));




    }

}

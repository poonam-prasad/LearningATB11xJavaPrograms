package ex_32_CollectionsFramework_List_DSA.SET;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab254_SetEx1 {

    public static void main(String[] args) {
        Set hashset=new HashSet();
        Set linkedHashSet=new LinkedHashSet();
        Set treeset=new TreeSet();

        hashset.add("Poonam");
        linkedHashSet.add("Amit");
        linkedHashSet.add("Amit");
        treeset.add("Myra");

        System.out.println(hashset);
        System.out.println(linkedHashSet);
        System.out.println(treeset);
    }
}

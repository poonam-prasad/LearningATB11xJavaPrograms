package ex_32_CollectionsFramework_List_DSA;

import java.util.ArrayList;
import java.util.List;

public class Lab243_ArrayList {
    public static void main(String[] args) {
        List l=new ArrayList();
        l.add("1");
        l.add("Poo");
        l.add(true);
        l.add("1.1");
        l.add("1");

        System.out.println(l);
        System.out.println(l.size());
        System.out.println(l.isEmpty());
        System.out.println(l.contains("1"));
        System.out.println(l.contains(1));
        System.out.println(l.indexOf("1"));
        System.out.println(l.lastIndexOf("1"));

        for(int i=0;i<l.size();i++){
            System.out.println(l.get(i));
        }
        l.clear();
        System.out.println(l);
    }
}

package ex_32_CollectionsFramework_List_DSA.List;

import java.util.ArrayList;
import java.util.List;

public class Lab242_ArrayList {
    public static void main(String[] args) {
        ArrayList elements=new ArrayList();
        elements.add(1);
        elements.add("Poonam");
        elements.add(true);
        elements.add(1.2);

        System.out.println(elements);
        System.out.println(elements.size());
        System.out.println(elements.isEmpty());

        List elements1=new ArrayList();//Dynamic dispatch
        elements1.add(2);
        elements1.add("hello");
        System.out.println(elements1);
        System.out.println(elements1.isEmpty());
        System.out.println(elements1.size());

        List elements2=new ArrayList();
        System.out.println(elements2.isEmpty());
    }
}

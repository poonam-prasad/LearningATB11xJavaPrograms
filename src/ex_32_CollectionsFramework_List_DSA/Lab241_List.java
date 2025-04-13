package ex_32_CollectionsFramework_List_DSA;

import java.util.ArrayList;
import java.util.List;

public class Lab241_List {
    public static void main(String[] args) {

        //List fruits=new List();//Not allowed List is Interface so can't create objects/instance

        List fruits=List.of("Mango","Apple","Grapes");

        System.out.println(fruits);
        //fruits.add("chiku");//Not possible, add method is incomplete //.UnsupportedOperationException
        System.out.println(fruits);

        List elements=new ArrayList(); //Dynamic Dispatch
        //ArrayList elements1=new ArrayList();

        elements.add(1);
        elements.add("Poonam");
        elements.add(false);

        System.out.println(elements);
    }
}

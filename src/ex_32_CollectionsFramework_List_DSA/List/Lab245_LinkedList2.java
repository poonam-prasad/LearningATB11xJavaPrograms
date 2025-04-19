package ex_32_CollectionsFramework_List_DSA.List;

import java.util.LinkedList;

public class Lab245_LinkedList2 {
    public static void main(String[] args) {
        LinkedList animals=new LinkedList();
        animals.add("Cat");
        animals.add("Dog");

        System.out.println(animals);

        animals.addFirst("Elephant");
        animals.addLast("Rhino");

        System.out.println(animals.getFirst());
        System.out.println(animals.getLast());

        System.out.println(animals);

        animals.removeFirst();
    animals.removeLast();

        System.out.println(animals);
        System.out.println("Size of LL "+animals.size());
    }
}

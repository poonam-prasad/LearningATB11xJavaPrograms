package ex_32_CollectionsFramework_List_DSA.List;

import java.util.Stack;

public class Lab252_Stack {
    public static void main(String[] args) {
        Stack<String> stack=new Stack<>();
        stack.push("Poonam");
        stack.push("Amit");
        stack.push("Myra");

        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack);
        System.out.println("-----");
        System.out.println(stack.pop());
        System.out.println(stack);

        stack.add("Ahaan");
        stack.add("Avyaan");
        System.out.println(stack.add("Suraj"));

        System.out.println(stack);
        System.out.println(stack.size());
        System.out.println(stack.isEmpty());


    }
}

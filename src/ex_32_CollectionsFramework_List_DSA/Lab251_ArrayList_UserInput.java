package ex_32_CollectionsFramework_List_DSA;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab251_ArrayList_UserInput {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        ArrayList<String> names=new ArrayList<>();
        ArrayList<Integer> age=new ArrayList<>();

        String continueInput="Y";

        while(continueInput.equalsIgnoreCase("Y")){
            System.out.println("Enter name ");
            names.add(scanner.next());

            System.out.println("Enter Age");
            age.add(scanner.nextInt());

            scanner.nextLine();
            System.out.println("Do u want to continue Y/N");
            continueInput= scanner.nextLine();
        }

        for(Object o1:names){
            System.out.println(o1);
        }

        for(Object o2:age){
            System.out.println(o2);
        }
    }
}

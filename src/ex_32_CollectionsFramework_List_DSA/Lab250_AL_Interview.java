package ex_32_CollectionsFramework_List_DSA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab250_AL_Interview {
    public static void main(String[] args) {
        List marks=new ArrayList();
        marks.add(90);
        marks.add(50);
        marks.add(100);
        marks.add(40);
        marks.add(70);

        System.out.println(marks);

        Collections.sort(marks);
        System.out.println("Marks after sorting");
        System.out.println(marks);

      Collections.sort(marks,Collections.reverseOrder());
        System.out.println("Sorting in Descending order");
        System.out.println(marks);
    }
}

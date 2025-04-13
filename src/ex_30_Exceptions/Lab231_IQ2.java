package ex_30_Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab231_IQ2 {
    public static void main(String[] args) {
        System.out.println("Start");
        //Checked exception, File Not found exception
        try {
            FileReader f=new FileReader(new File("C://abc.txt"));
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("End");

    }
}

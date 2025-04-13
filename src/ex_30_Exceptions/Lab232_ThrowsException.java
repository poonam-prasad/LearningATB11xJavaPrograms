package ex_30_Exceptions;

import java.io.File;
import java.io.FileInputStream;

public class Lab232_ThrowsException  {
    public static void main(String[] args) throws Exception {
        FileInputStream file = new FileInputStream("C://abc.txt");
        String name = null;
        name.trim();
        int a = 10 / 0;
        File f = new File("C://text.txt");
    }
        static void t() throws Exception{
            FileInputStream f1=new FileInputStream("C://abc.txt");
        }
    }


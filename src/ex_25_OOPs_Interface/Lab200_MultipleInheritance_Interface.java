package ex_25_OOPs_Interface;

public class Lab200_MultipleInheritance_Interface
{
    public static void main(String[] args) {

        Son s=new Son();
        s.money();

    }
}

interface Father{
    void money();
}

interface Mother{
    void money();
}

class Son implements Father,Mother{
   public void money(){
       System.out.println("Child Money");
    }
}
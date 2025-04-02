package ex_19_OOPs_Inheritance.MultiLevel_Inheritance;

public class Father extends GrandFather {

    void bhk2(){
        System.out.println("F bhk2");
    }

    @Override
    void home() {
        System.out.println("F home");
    }
}

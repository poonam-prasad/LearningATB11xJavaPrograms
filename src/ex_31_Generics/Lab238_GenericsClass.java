package ex_31_Generics;

public class Lab238_GenericsClass {
    public static void main(String[] args) {
        GenericsClass <Integer> obj_ref=new GenericsClass(5);
        GenericsClass <String> obj_ref1=new GenericsClass("Poonam");

        System.out.println(obj_ref.getData());
        System.out.println(obj_ref1.getData());

    }
}

class GenericsClass <T> {
    private T data;

    public GenericsClass(T data){
        this.data=data;
    }

    public T getData(){
        return this.data;
    }
}
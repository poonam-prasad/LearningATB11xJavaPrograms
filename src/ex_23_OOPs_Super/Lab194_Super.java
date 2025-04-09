package ex_23_OOPs_Super;

public class Lab194_Super {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.sound();

    }
}

class God{
    void sound(){
        System.out.println("God!!!");
    }
}

class Animal extends God{

    protected String color="White";
    void sound()
    {
        System.out.println("Animal sound");
        super.sound();
    }
}

class Dog extends Animal{
    private String color="Brown";
    void sound(){
        System.out.println("Dog Barks");
        super.sound();
        System.out.println(this.color);
        System.out.println(super.color);
    }
}

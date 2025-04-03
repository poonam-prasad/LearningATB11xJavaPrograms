package ex_20_OOPs_Polymorphism.MethodOverridding;

public class Lab189_MethodOverriding {
    public static void main(String[] args) {

        Dog d=new Dog();
        d.sound();
    }
}

class Animal{

    void sound()
    {
        System.out.println("Animal Sound");
    }
}

class Dog extends Animal{

    @Override
    void sound() {
        System.out.println("Bark!!");
    }
}
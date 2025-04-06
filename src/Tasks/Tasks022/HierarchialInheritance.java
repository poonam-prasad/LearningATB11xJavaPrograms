package Tasks.Tasks022;

public class HierarchialInheritance {
    public static void main(String[] args) {
    Dog3 d=new Dog3();
    d.bark();
    d.sound();
        System.out.println("-----------");
    Cat c=new Cat();
    c.meow();
    c.sound();
    }
}

class Animal3{
    void sound(){
        System.out.println("This is Animal Sound");
    }
}
class Dog3 extends Animal3{
    void bark(){
        System.out.println("Dog is Barking");
    }
}
class Cat extends Animal3{
    void meow(){
        System.out.println("Cat is Meowing");
    }
}

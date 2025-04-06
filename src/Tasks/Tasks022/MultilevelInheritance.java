package Tasks.Tasks022;

public class MultilevelInheritance {
    public static void main(String[] args) {
        Husky h=new Husky();
        h.huskyBreed();
       h.bark();
       h.eat();

    }
}

class Animal1{
    void eat(){
        System.out.println("Animal is Eating");
    }
}

class Dog1 extends Animal1{
    void bark(){
        System.out.println("Dog is Barking");
    }
}

class Husky extends Dog1{
    void huskyBreed(){
        System.out.println("Husky breed");
    }
}

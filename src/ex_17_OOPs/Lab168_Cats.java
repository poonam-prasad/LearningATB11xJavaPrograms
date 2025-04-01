package ex_17_OOPs;

public class Lab168_Cats {
    public static void main(String[] args) {
        Cat c1=new Cat();
        Cat c2;
        new Cat().walk();
        System.out.println(new Cat().breed);
      c1.breed="Baby Cat";
        System.out.println(c1.breed);
    }
}

class Cat{
    String breed;

    void walk(){
        System.out.println("Cat is walking ");
    }
}

package ex_17_OOPs;

public class Person2 {
    public static void main(String[] args) {
        System.out.println("Bye!!");
    }
}

class P1{}

class P2{}

//class 1P{} Not allowed, Class identifier Can't start with digit

class _P1{}

class $P1{}

//class a b{ } Spaces not allowed in class name

//class P1{}  Duplicate classes not allowed

class newPerson{
    public static void main(String[] args) {
        System.out.println("I have another Main method but my class cannot be Public");
    }
}

class P3{    //Multiple Child classes allowed
    class P4{
        class P5{
            class P6{

            }
        }
    }
}
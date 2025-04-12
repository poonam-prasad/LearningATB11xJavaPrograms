package ex_27_StaticBlock;


public class Lab207_StaticMethods {
    public static void main(String[] args) {

        B.staticMethod();
        System.out.println(B.a);

        B ref=new B();
        ref.displayNonStatic();
        System.out.println(ref.b);



    }
}

class B{

    static int a=10;
    int b=20;

    static {
        System.out.println("Static block");
    }

    static void staticMethod(){
        System.out.println("Static value="+a);
        //System.out.println(b);  //non static can't be called in static block
        System.out.println(a);
    }

    void displayNonStatic(){
        System.out.println("Non static Display");
        System.out.println(a);//static variables can be called in nonstatic
        System.out.println(b);
    }
}

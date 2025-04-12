package ex_27_StaticBlock;

public class Lab206_StaticVariable {
    public static void main(String[] args) {

        C c1=new C(100);
        System.out.println(c1.a);
        c1.displayValue();

        //System.out.println(c1.b);

        System.out.println(C.b);
        System.out.println("------------");

        C.b=200;
        System.out.println(C.b);
        C c2=new C(500);
        System.out.println(c2.a);
        c2.displayValue();



    }
}

class C{
    int a;
    static int b=20;

   C(int a){
       this.a=a;
   }

   void displayValue(){
       System.out.println(this.a);
   }

}

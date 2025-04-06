package ex_22_AccessModifier;

public class Lab192 {
    public static void main(String[] args) {
        Son s=new Son();
        s.getAssets();


    }
}

class Father{

    private int father_gold=11000;
    protected String home="2BHK";

}

class Son extends Father{

    void getAssets(){
        System.out.println(home);
        //System.out.println(father_gold);
    }
}


package ex_27_StaticBlock;

public class Lab208_RealExample {
    public static void main(String[] args) {
        ATB.staticMethod();
        System.out.println(ATB.mentor);
        System.out.println(ATB.courseName);

        ATB amit=new ATB();
        System.out.println(amit.getName());

        amit.setName("Amit Kumar");
        System.out.println(amit.getName());
        amit.nonStaticMethod();


    }
}

class ATB{
    private String name;
    private int phoneNo;
    static String courseName="ATB11x";
    static String mentor="Pramod";

    static {
        System.out.println("Static block called first");
    }
    public String getName(){
        return name;
    }
    void setName(String name){
        this.name=name;
    }

    public int getPhoneNo(){
        return phoneNo;
    }

    void setPhoneNo(int phoneNo){
        this.phoneNo=phoneNo;
    }

    public static void staticMethod(){
        System.out.println("Static method");
        //System.out.println(name);   //Non static can't be called in static
        System.out.println(mentor+" "+courseName);

    }

    public void nonStaticMethod(){
        System.out.println("Non static method");
        System.out.println(name+" "+phoneNo+" "+mentor+" "+courseName);
        staticMethod();
    }
}
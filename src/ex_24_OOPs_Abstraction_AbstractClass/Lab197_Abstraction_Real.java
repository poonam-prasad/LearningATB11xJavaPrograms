package ex_24_OOPs_Abstraction_AbstractClass;

public class Lab197_Abstraction_Real {
    public static void main(String[] args) {
        SalaryCompute s=new SalaryCompute();
        System.out.println(s.computePay());
        s.mailCheck(1,"Poonam","Ranchi");

        //Employee s1=new SalaryCompute();
    }
}

abstract  class Employee{
    protected int EmpNumber;
    public String name;
    public String address;

    Employee(){
        System.out.println("Default constructor");
    }

    Employee(int EmpNumber,String name,String address){
        this.name=name;
        this.address=address;
        this.EmpNumber=EmpNumber;
    }
    abstract int computePay();

    void mailCheck(int EmpNumber,String name,String address){
        System.out.println("Employee can check mail"+EmpNumber+name+address);
    }
}

class SalaryCompute extends Employee{

    int computePay(){
       return 10;

    }


}
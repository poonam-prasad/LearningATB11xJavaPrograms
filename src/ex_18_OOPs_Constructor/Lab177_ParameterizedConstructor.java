package ex_18_OOPs_Constructor;

public class Lab177_ParameterizedConstructor {
    public static void main(String[] args) {

        Car1 c1=new Car1(); //Default constructor will be called
        System.out.println(c1.carName+" "+c1.carModel+" "+c1.yearOfManufacture);

        //Parameterized Constructor will be called
        Car1 c2=new Car1("XUV700","Mahindra",2020);
        System.out.println(c2.carName+" "+c2.carModel+" "+c2.yearOfManufacture);

        Car1 c3=new Car1("Tesla","Model3",2015);
        System.out.println(c3.carName);
    }
}

class Car1{
    String carName;
    String carModel;
    int yearOfManufacture;

    Car1()
    {
        carName="Unknown Car name";
        carModel="XXX";
        yearOfManufacture=1990;
        System.out.println("Default constructor called!");
    }

    Car1(String carNameOC,String carModelOC,int yearOC)
    {
        this.carName=carNameOC;
        this.carModel=carModelOC;
        this.yearOfManufacture=yearOC;
        System.out.println("Parametrized Constructor called!!");
    }
}

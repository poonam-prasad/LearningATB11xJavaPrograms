package ex_18_OOPs_Constructor;

public class Lab176_DC_Car {
    public static void main(String[] args) {
        Car c1=new Car();
        System.out.println(c1.carName);
        System.out.println(c1.carModel);
        System.out.println(c1.yearOfManufacture);

        Car c2=new Car();
        c2.carName="XUV700";
        c2.carModel="Mahindra";
        c2.yearOfManufacture=2020;
        System.out.println(c2.carName);
        System.out.println(c2.carModel);
        System.out.println(c2.yearOfManufacture);


    }
}
class Car{
    String carName;
    String carModel;
    int yearOfManufacture;

    Car(){
        carName="Unknown Car Name";
        carModel="XXX";
        yearOfManufacture=1990;
    }

}
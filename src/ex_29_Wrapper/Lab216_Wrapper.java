package ex_29_Wrapper;

public class Lab216_Wrapper {
    public static void main(String[] args) {

        Mobile iphone=new Mobile(13,"iPhone13",100000.00);
        Mobile samsung=new Mobile(123,"Samsung",60000.00);

        iphone.display();
        samsung.display();

        System.out.println(Mobile.mobileCarrier);
        Mobile.switchOnAirplaneMode();

        iphone.setPhonePrice(150000.00);
        System.out.println(iphone.getPhonePrice());

    }
}

//Abstraction
interface SIMCard{
    abstract void insertSIM();
}

class OldPhone implements SIMCard{

    public void insertSIM(){
        System.out.println("SIM Inserted");
    }

    void calling()
    {
        System.out.println("Dial pad calling");
    }
}

class Mobile extends OldPhone{

    //Encapsulation
    private Integer phoneModelNo;
    private String phoneName;
    private Double phonePrice;
    static String mobileCarrier="Airtel";

    Mobile(){
        System.out.println("Default constructor");
    }

    Mobile(Integer phoneModelNo,String phoneName,Double phonePrice){
        this.phoneModelNo=phoneModelNo;
        this.phoneName=phoneName;
        this.phonePrice=phonePrice;
    }

    Integer getPhoneModelNo(){
        return this.phoneModelNo;
    }

    void setPhoneModelNo(Integer phoneModelNo){
        this.phoneModelNo=phoneModelNo;
    }

    String getPhoneName(){
        return phoneName;
    }

    void setPhoneName(String phoneName){
        this.phoneName=phoneName;
    }

    Double getPhonePrice(){
        return this.phonePrice;
    }

    void setPhonePrice(Double phonePrice){
        this.phonePrice=phonePrice;
    }

    void display(){
        System.out.println(this.phoneModelNo+" "+this.phoneName+" "+this.phonePrice);
    }

    //Static Method
    static void switchOnAirplaneMode(){
        System.out.println("Airplane mode switched on!");
    }

    //Method Overloading -- Polymorphism
    void priceChange(Integer phonePrice){
        System.out.println("Price change in Integer");
    }
    void priceChange(Double phonePrice)
    {
        System.out.println("Price change in Double");
    }

    //Method Overriding
    void calling(){
        System.out.println("Touch pad calling");
    }
}
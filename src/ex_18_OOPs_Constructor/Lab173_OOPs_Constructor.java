package ex_18_OOPs_Constructor;

public class Lab173_OOPs_Constructor {
    public static void main(String[] args) {
        Baby b1=new Baby();//Default constructor called
        Baby b2;
        b1.name="Ahaan";
        b1.cry();
        b1.drinkMilk();
        b1.sleep();
        System.out.println(b1.name);
        System.out.println(new Baby());
    }
}
class Baby{
    //Instance variable,Data members,Properties,Attributes
    String name;
     Baby(){
         System.out.println("I am Default Constructor!!");
         //Fetch data from mySQL DB
         //Read Test Data from csv,xlsx
         //Open file and Read data, json,txt file
    }

    //Member Functions,Behavior, Methods
    void cry(){
        System.out.println("Baby is crying!!!");
    }
    void sleep(){
        System.out.println("Baby is Sleeping");
    }
    void drinkMilk(){
        System.out.println("Baby is drinking Milk");
    }
}

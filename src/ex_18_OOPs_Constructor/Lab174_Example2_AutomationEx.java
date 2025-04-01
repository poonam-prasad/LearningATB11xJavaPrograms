package ex_18_OOPs_Constructor;

public class Lab174_Example2_AutomationEx {
    public static void main(String[] args) {
        WebAutomation webAutomation=new WebAutomation();
    }
}
 class WebAutomation{
     WebAutomation() //Default Constructor
     {
         System.out.println("Reading data from csv file");
         System.out.println("Open page before running the scripts");
         System.out.println("We can do whatever we want to do when Object created ");

         //FileInputStream file=new FileInputStream("C://a.txt")
     }
 }
package ex_19_OOPs_Inheritance.SingleInheritance;

public class TestCase2 extends CommonToAll{
    void testCase2(){
        startBrowser();
        System.out.println("Running TC2");
        readExcel();
        readDatabaseFile();
        closeBrowser();
    }

}

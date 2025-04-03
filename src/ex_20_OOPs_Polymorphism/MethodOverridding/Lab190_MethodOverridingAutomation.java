package ex_20_OOPs_Polymorphism.MethodOverridding;

public class Lab190_MethodOverridingAutomation {
    public static void main(String[] args) {

        CommonToAll c1=new CommonToAll();
        c1.openBrowser();
        System.out.println("--------------");

        ChromeTC chrome=new ChromeTC();
        chrome.openBrowser();
        System.out.println("--------------");

        FirefoxTC f=new FirefoxTC();
        f.openBrowser();
        System.out.println("--------------");

        CommonToAll c2=new ChromeTC();  //Dynamic dispatch
        c2.openBrowser();
        System.out.println("--------------");

        CommonToAll f2=new FirefoxTC();//Dynamic dispatch
        f2.openBrowser();

    }
}

class CommonToAll{
    void openBrowser()
    {
        System.out.println("Open IE Browser");
    }
}

class ChromeTC extends CommonToAll{
    void openBrowser(){
        System.out.println("Open Chrome browser");
    }

    int openBrowser(int a){
        return 10;
    }
}

class FirefoxTC extends CommonToAll{
    void openBrowser(){
        System.out.println("Open Firefox browser");
    }

}
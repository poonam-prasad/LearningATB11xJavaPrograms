package Tasks.Tasks022;

public class MethodOverriding {
    public static void main(String[] args) {
        CommonToAll c=new CommonToAll();
        c.openBrowser();
        System.out.println("------------");

        CommonToAll chrome=new ChromeBrowser();
        chrome.openBrowser();
        System.out.println("------------");

        FirefoxBrowser firefox=new FirefoxBrowser();
        firefox.openBrowser();
        System.out.println("------------");

        CommonToAll edge=new EdgeBrowser();
        edge.openBrowser();

    }
}

class CommonToAll{
    void openBrowser(){
        System.out.println("Open any Browser");
    }
}

class ChromeBrowser extends CommonToAll{
    void openBrowser(){
        System.out.println("Open Chrome browser");
    }
}

class FirefoxBrowser extends CommonToAll{
    void openBrowser(){
        System.out.println("Open Firefox browser");
    }
}

class EdgeBrowser extends CommonToAll{
    void openBrowser(){
        System.out.println("Open Edge browser");
    }
}

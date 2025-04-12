package ex_28_Enum;

public enum Locators {

    inputBox("#input"),
    pageBtn("#btn");

    private String locators;

    Locators(String locators){
        this.locators=locators;
    }

    String getInputBox(){
        return this.locators;
    }

    String getBtn(){
        return this.locators;
    }

}

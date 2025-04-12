package ex_28_Enum;

public class Lab211_Enum_Locators {
    public static void main(String[] args) {
        System.out.println(Locators.pageBtn.getBtn());
        System.out.println(Locators.inputBox.getInputBox());

        System.out.println("-------------");
        System.out.println(Colors.RED.getColor());
        System.out.println("--------------");

        System.out.println(APIUrls.google.getAPI());
        System.out.println(APIUrls.playwright.getAPI());

    }
}

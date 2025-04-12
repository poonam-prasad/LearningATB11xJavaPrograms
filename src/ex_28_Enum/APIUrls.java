package ex_28_Enum;

public enum APIUrls {

    google("https://www.google.com"),
    playwright("https://playwright.dev");

    private String API;

    APIUrls(String API){
        this.API=API;
    }

    String getAPI(){
        return API;
    }
}

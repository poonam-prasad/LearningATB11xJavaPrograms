package ex_28_Enum;

public enum Colors {

    RED("#FF0000"),
    GREEN("#61FF33"),
    BLUE("#3377FF"),
    YELLOW("#4477FF");

    private String color;

    Colors(String color){
        this.color=color;
    }

    String getColor(){
        return this.color;
    }
}

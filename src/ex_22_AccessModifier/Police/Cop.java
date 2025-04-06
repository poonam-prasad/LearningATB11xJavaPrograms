package ex_22_AccessModifier.Police;

public class Cop {

    private String iCard;
    private int gun;

    public Cop(int bullets){
        this.gun=bullets;
    }

    protected void canIShoot(){
        System.out.println("You can Shoot!");
    }
}





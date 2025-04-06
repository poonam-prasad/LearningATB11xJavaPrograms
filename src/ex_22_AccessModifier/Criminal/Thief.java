package ex_22_AccessModifier.Criminal;

import ex_22_AccessModifier.Police.Cop;

public class Thief {
    public static void main(String[] args) {
        Cop thief=new Cop(150);
        //thief.canIShoot(); //Method has protected access
    }
}

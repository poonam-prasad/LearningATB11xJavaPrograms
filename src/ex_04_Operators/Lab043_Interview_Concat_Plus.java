package ex_04_Operators;

public class Lab043_Interview_Concat_Plus
{
    public static void main(String[] args) {
        int a=10,b=20;
        String fNAME="Poonam";
        String lName="Prasad";

        System.out.println(fNAME+lName+a+b); //PoonamPrasad1020
        System.out.println(a+b+fNAME+lName); //30PoonamPrasad
        System.out.println(fNAME+lName+(a+b)); //PoonamPrasad30
    }
}

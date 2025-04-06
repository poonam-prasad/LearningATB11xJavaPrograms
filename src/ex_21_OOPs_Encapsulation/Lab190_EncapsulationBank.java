package ex_21_OOPs_Encapsulation;

public class Lab190_EncapsulationBank {
    public static void main(String[] args) {

        ICICIBank poonam=new ICICIBank("poonam",100000);
        System.out.println(poonam.getName());
        System.out.println(poonam.getBalance());
        poonam.setName("PoonamPrasad",true);
        poonam.setBalance(123444,true);
        System.out.println(poonam.getName());
        System.out.println(poonam.getBalance());

        System.out.println("-------------------");

        ICICIBank unknown=new ICICIBank("Unknown",1232424);
        System.out.println(unknown.getName());
        System.out.println(unknown.getBalance());

        unknown.setName("Unknown123",false);
        unknown.setBalance(213213213,false);
    }
}

class ICICIBank {

    private String name;
    private long balance;

    ICICIBank(String name, long balance) {
        this.name = name;
        this.balance = balance;
    }

    String getName() {
        return name;
    }

    void setName(String name, boolean isCashier) {
        if (isCashier) {
            this.name = name;
        } else {
            System.out.println("Not allowed to change Name "+name);
        }
    }

    long getBalance()
    {
        return balance;
    }

    void setBalance(long balance,boolean isCashier)
    {   if(isCashier)
        this.balance=balance;

        else
        System.out.println("Not allowed to change balance "+this.name+balance);
    }
}
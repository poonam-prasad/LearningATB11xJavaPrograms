package ex_30_Exceptions;

public class Bank {
    private String currency;
    private Integer amount;

    Bank(String currency, Integer amount) {
        this.currency = currency;
        this.amount = amount;
    }

    String getCurrency() {
        return this.currency;
    }

    void setCurrency(String currency) {
        this.currency = currency;
    }

    Integer getAmount() {
        return this.amount;
    }

    void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer addAmount(Bank bankName) {
        if (bankName.currency.equals("INR")) {
            return this.amount + bankName.amount;
        } else {
            try {
                throw new CustomException("Currency Mismatch");
            } catch (CustomException e) {
                System.out.println(e.getMessage());
            }
            return 0;
        }
    }


class CustomException extends Exception{

        CustomException(String msg){
            super(msg);
        }
}
}


package Bishnoi.Aman.bankkAccount;

public class bankAccount {
    private String accountholderName;
    private String accountNumber;
    private double balance;

    public bankAccount(String accountholderName, String accountNumber) {
        this.accountholderName = accountholderName;
        this.accountNumber = accountNumber;
    }

    public void depositMoney(double money){
        if(money<=0)
            System.out.println("INVALID deposit");
        else balance += money;
    }
    public double withdrawMoney(double money){
        if (balance<=0)
            System.out.println("invalid withdrawl ");
        else if (balance<=money){
            balance -= money;
        }
        else{
            money=balance;
            balance=0;
        }
        return money;
    }
}

package Bishnoi.Aman.bankkAccount;

public class customer {
    void main(String[] args) {
        bankAccount account= new bankAccount("0001" , "AMAN");
        account.depositMoney(80);
        System.out.println(account.withdrawMoney(40));
        account.depositMoney(-89);
        System.out.println(account.withdrawMoney(300));
    }
}

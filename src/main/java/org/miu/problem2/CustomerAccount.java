package org.miu.problem2;

public class CustomerAccount {
    private String cus_name;
    private String acc_No;
    private double balance;

    public CustomerAccount(String cus_name, double balance, String acc_No) {
        this.cus_name = cus_name;
        this.balance = balance;
        this.acc_No = acc_No;
    }

    public String getCus_name() {
        return cus_name;
    }

    public String getAcc_No() {
        return acc_No;
    }
    public boolean deposit (double amount){
        if (amount <= 0) {
            System.out.println("Invalid deposit amount.");
            return false;
        }
        balance+=amount;
        System.out.println("Successfully deposited: $" + amount);
        return true;
    }
    public boolean withdraw(double amount){
        if(amount<0) return false;
        if(amount>balance)  throw new ThresholdViolationException("Withdrawal amount exceeds current balance.");
        balance-=amount;

        if (balance < 100) {
            throw new ThresholdViolationException("Balance below minimum of $100 after withdrawal.");
        }
        System.out.println("Successfully withdrew: $" + amount);
        return true;
    }
    public double getBalance() {
        return balance;
    }
}

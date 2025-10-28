package br.com.minhaempresa.model;

public class BankAccount {
    private int accountNumber;
    private double bankBalance;
    public String accountOwner;

    public BankAccount(int accountNumber, double bankBalance, String accountOwner) {
        this.accountNumber = accountNumber;
        this.bankBalance = bankBalance;
        this.accountOwner = accountOwner;
    }

    public void setAccountNumber (int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBankBalance(double bankBalance) {
        this.bankBalance = bankBalance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBankBalance() {
        return bankBalance;
    }

    public void accountInformations () {
        System.out.println("Account Owner: " + accountOwner);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Balance: " + bankBalance);
    }
}

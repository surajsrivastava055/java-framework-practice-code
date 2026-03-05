package com.gyan.bankAccountManagement;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount=new BankAccount(123456,"Gyan Shrivastava",5000);
        System.out.println(bankAccount);

        bankAccount.deposit(4000);
        bankAccount.withdraw(10000);
        bankAccount.withdraw(7000);

    }
}

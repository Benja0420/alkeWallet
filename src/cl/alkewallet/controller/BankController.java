package cl.alkewallet.controller;

import cl.alkewallet.model.CurrentAccount;
import cl.alkewallet.model.SavingsAccount;

import java.util.Scanner;

public class BankController {
    private CurrentAccount currentAccount;
    private SavingsAccount savingsAccount;
    private Scanner scanner;

    public BankController() {
        this.currentAccount = new CurrentAccount();
        this.savingsAccount = new SavingsAccount();
        this.scanner = new Scanner(System.in);
    }

    public void depositToCurrentAccount() {
        System.out.print("Ingrese el monto a depositar en cuenta corriente: ");
        double amount = scanner.nextDouble();
        currentAccount.deposit(amount);
        System.out.println("Depósito realizado en cuenta corriente.");
    }

    public void withdrawFromCurrentAccount() {
        System.out.print("Ingrese el monto a retirar de cuenta corriente: ");
        double amount = scanner.nextDouble();
        currentAccount.withdraw(amount);
        System.out.println("Retiro realizado de cuenta corriente.");
    }

    public void viewCurrentAccountBalance() {
        System.out.println("Saldo de cuenta corriente: " + currentAccount.getBalance() + " " + currentAccount.getCurrency());
    }

    public void changeCurrentAccountCurrency() {
        System.out.print("Ingrese la nueva divisa (USD, EUR, JPY, CLP): ");
        String newCurrency = scanner.next().toUpperCase();
        currentAccount.changeCurrency(newCurrency);
    }

    public void depositToSavingsAccount() {
        System.out.print("Ingrese el monto a depositar en cuenta de ahorro: ");
        double amount = scanner.nextDouble();
        savingsAccount.deposit(amount);
        System.out.println("Depósito realizado en cuenta de ahorro.");
    }

    public void withdrawFromSavingsAccount() {
        System.out.print("Ingrese el monto a retirar de cuenta de ahorro: ");
        double amount = scanner.nextDouble();
        savingsAccount.withdraw(amount);
        System.out.println("Retiro realizado de cuenta de ahorro.");
    }

    public void viewSavingsAccountBalance() {
        System.out.println("Saldo de cuenta de ahorro: " + savingsAccount.getBalance() + " " + savingsAccount.getCurrency());
    }

    public void changeSavingsAccountCurrency() {
        System.out.print("Ingrese la nueva divisa (USD, EUR, JPY, CLP): ");
        String newCurrency = scanner.next().toUpperCase();
        savingsAccount.changeCurrency(newCurrency);
    }
}
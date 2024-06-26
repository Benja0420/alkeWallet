package cl.alkewallet.model;

public abstract class Account {
    protected double balance;
    protected String currency;

    public Account() {
        this.currency = "CLP";
    }

    public double getBalance() {
        return balance;
    }

    public String getCurrency() {
        return currency;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Fondos insuficientes.");
        }
    }

    public void changeCurrency(String newCurrency) {
        if (!currency.equals(newCurrency)) {
            balance = CurrencyConverter.convert(balance, currency, newCurrency);
            currency = newCurrency;
            System.out.println("Saldo en nueva divisa: " + balance + " " + currency);
        }
    }
}

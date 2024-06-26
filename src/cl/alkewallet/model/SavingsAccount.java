package cl.alkewallet.model;

public class SavingsAccount extends Account {
    private static final int FREE_WITHDRAWALS_PER_MONTH = 3;
    private static final double WITHDRAWAL_FEE = 0.5;
    private int withdrawalsThisMonth;

    public SavingsAccount() {
        super();
        this.withdrawalsThisMonth = 0;
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            withdrawalsThisMonth++;

            if (withdrawalsThisMonth > FREE_WITHDRAWALS_PER_MONTH) {
                balance -= WITHDRAWAL_FEE;
                System.out.println("Se ha aplicado un cargo por retiro. Nuevo saldo: " + balance + " " + currency);
            } else {
                System.out.println("Retiro realizado de cuenta de ahorro. Nuevo saldo: " + balance + " " + currency);
            }
        } else {
            System.out.println("Fondos insuficientes.");
        }
    }
}

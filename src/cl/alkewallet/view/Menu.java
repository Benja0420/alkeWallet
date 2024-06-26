package cl.alkewallet.view;

import cl.alkewallet.controller.BankController;

import java.util.Scanner;

public class Menu {
    private BankController bankController;
    private Scanner scanner;

    public Menu() {
        this.bankController = new BankController();
        this.scanner = new Scanner(System.in);
    }

    public void displayMenu() {
        System.out.println("   (      (     )         (  (            (   (           )  ");
        System.out.println("   )\\     )\\ ( /(    (    )\\))(   '    )  )\\  )\\   (   ( /(  ");
        System.out.println("((((_)(  ((_))\\())  ))\\  ((_)()\\ )  ( /( ((_)((_) ))\\  )\\()) ");
        System.out.println(" )\\ _ )\\  _ ((_)\\  /((_) _(())\\_)() )(_)) _   _  /((_)(_))/  ");
        System.out.println(" (_)_\\(_)| || |(_)(_))   \\ \\((_)/ /((_)_ | | | |(_))  | |_   ");
        System.out.println("  / _ \\  | || / / / -_)   \\ \\/\\/ / / _` || | | |/ -_) |  _|  ");
        System.out.println(" /_/ \\_\\ |_||_\\_\\ \\___|    \\_/\\_/  \\__,_||_| |_|\\___|  \\__|  ");
        System.out.println("");
        int option = 0;

        while (option != 9) {
            System.out.println("+---------------------------------------+");
            System.out.println("| Cuenta Corriente  | Cuenta de Ahorro  |");
            System.out.println("+---------------------------------------+");
            System.out.println("| 1- Depositar      | Depositar      -5 |");
            System.out.println("| 2- Retirar        | Retirar        -6 |");
            System.out.println("| 3- Ver saldo      | Ver saldo      -7 |");
            System.out.println("| 4- Cambiar divisa | Cambiar divisa -8 |");
            System.out.println("|                   | Salir          -9 |");
            System.out.println("+---------------------------------------+");
            System.out.print("Seleccione una opción: ");
            option = scanner.nextInt();

            handleOption(option);
        }
    }

    private void handleOption(int option) {
        switch (option) {
            case 1:
                bankController.depositToCurrentAccount();
                break;
            case 2:
                bankController.withdrawFromCurrentAccount();
                break;
            case 3:
                bankController.viewCurrentAccountBalance();
                break;
            case 4:
                bankController.changeCurrentAccountCurrency();
                break;
            case 5:
                bankController.depositToSavingsAccount();
                break;
            case 6:
                bankController.withdrawFromSavingsAccount();
                break;
            case 7:
                bankController.viewSavingsAccountBalance();
                break;
            case 8:
                bankController.changeSavingsAccountCurrency();
                break;
            case 9:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Opción no válida, intente de nuevo.");
        }
    }
}

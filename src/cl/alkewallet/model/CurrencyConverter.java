package cl.alkewallet.model;

public class CurrencyConverter {
    public static double convert(double amount, String fromCurrency, String toCurrency) {
        double rate = getRate(fromCurrency, toCurrency);
        return amount * rate;
    }

    private static double getRate(String fromCurrency, String toCurrency) {
        if (fromCurrency.equals("CLP") && toCurrency.equals("USD")) {
            return 0.0011;
        } else if (fromCurrency.equals("CLP") && toCurrency.equals("EUR")) {
            return 0.0010;
        } else if (fromCurrency.equals("CLP") && toCurrency.equals("JPY")) {
            return 0.15;
        } else if (fromCurrency.equals("USD") && toCurrency.equals("CLP")) {
            return 1 / 0.0011;
        } else if (fromCurrency.equals("EUR") && toCurrency.equals("CLP")) {
            return 1 / 0.0010;
        } else if (fromCurrency.equals("JPY") && toCurrency.equals("CLP")) {
            return 1 / 0.15;
        } else if (fromCurrency.equals("USD") && toCurrency.equals("EUR")) {
            return 0.91;
        } else if (fromCurrency.equals("EUR") && toCurrency.equals("USD")) {
            return 1.1;
        } else if (fromCurrency.equals("USD") && toCurrency.equals("JPY")) {
            return 109.62;
        } else if (fromCurrency.equals("JPY") && toCurrency.equals("USD")) {
            return 0.0091;
        } else if (fromCurrency.equals("EUR") && toCurrency.equals("JPY")) {
            return 120.96;
        } else if (fromCurrency.equals("JPY") && toCurrency.equals("EUR")) {
            return 0.0083;
        } else {
            return 1.0;
        }
    }
}

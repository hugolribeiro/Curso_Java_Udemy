package utils;

public class CurrencyConverter {

    private static double IOF = 0.06;

    public static double dollarToReal(double amount, double dollarPrice){
        return amount * dollarPrice * (1 + IOF);
    }

}

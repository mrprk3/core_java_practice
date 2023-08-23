package com.mrprk.tp;
public class CurrencyConverter {

    public static double equivalentValue(double exchangeRate) {
        return 1.0 / exchangeRate;
    }

    public static void main(String[] args) {
        // Given exchange rate: 1 USD = 83.1654 INR
        double exchangeRate = 106.318;

        double equivalent = equivalentValue(exchangeRate);

        System.out.println( equivalent );
    }
}

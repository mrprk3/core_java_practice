package com.mrprk.tp;

public class DecimalTruncator {

    public static double truncateToSixDecimals(double value) {
        double factor = Math.pow(10, 5);
        return Math.floor(value * factor) / factor;
    }

    public static void main(String[] args) {
        double inputValue = 0.009415745029063751;
        double truncatedValue = truncateToSixDecimals(inputValue);
        System.out.println(truncatedValue);
    }
}


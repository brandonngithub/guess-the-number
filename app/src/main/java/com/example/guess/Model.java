package com.example.guess;

import java.text.DecimalFormat;

public class Model {
    public static double getBMI(double weight, double height) {
        double result = weight/height/height;
        return result;
    }

    public static double toDouble(String s) {
        return Double.parseDouble(s);
    }

    public static String formatBMI(double bmi) {
        DecimalFormat df = new DecimalFormat("##.#");
        String oneDecimal = df.format(bmi);
        return oneDecimal;
    }
}
package main;

import java.text.DecimalFormat;

public class RestaurantFunctions {

    private static final double TAX_PERCENT = .1;

    public double showOriginalPrice(String fruit) {
        //Note: these numbers are made up and are not based off of real world 
        //prices of various foods
        if (fruit.equals("apple")) {
            return 3.5;
        } else if (fruit.equals("banana")) {
            return 4;
        } else if (fruit.equals("coconut")) {
            return 7;
        } else {
            return 2;
        }
    }

    public double addTax(Double price) {
        Double tax = 0.0;
        tax = price * TAX_PERCENT;
        DecimalFormat df = new DecimalFormat("#.##");
        tax = Double.parseDouble(df.format(tax));
        return tax;
    }

    public double addSuggestedTip(String fruit) {
        //Note: these numbers are made up and are not based off of real world 
        //tips
        if (fruit == "apple") {
            return 2;
        } else if (fruit == "banana") {
            return 3;
        } else if (fruit == "coconut") {
            return 4;
        } else {
            return 5;
        }

    }

    public double calculateFinalPrice(Double price, Double tax, Double tip) {
        Double finalPrice = price + tax + tip;
        return finalPrice;

    }
}

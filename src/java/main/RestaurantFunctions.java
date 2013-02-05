package main;


import java.text.DecimalFormat;

public class RestaurantFunctions {
    public double displayPrice(String fruit) {
        if (fruit == "apple") {
            return 3.5;
        } else if (fruit == "banana") {
            return 4;
        } else if (fruit == "coconut") {
            return 7;
        } else return 2;
    }
    
    public double addTax(Double price) {
        Double tax = 0.0;
        tax = price * .1;
        DecimalFormat df = new DecimalFormat("#.##");
        df.format(tax);
        return tax;
    }
    
    public double suggestedTip(String fruit) {
        if (fruit == "apple") {
            return 2;
        } else if (fruit == "banana") {
            return 3;
        } else if (fruit == "coconut") {
            return 4;
        } else return 5;
    }
    
    public double finalPrice(String fruit) {
        if (fruit == "apple") {
            return 5.85;
        } else if (fruit == "banana") {
            return 7.40;
        } else if (fruit == "coconut") {
            return 11.70;
        } else return 7.20;
    }
}

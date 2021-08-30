package work.day1;

import java.util.Scanner;

interface CurrencyConverter{
    double dollarValue();
    public static double convert(double value, CurrencyConverter from, CurrencyConverter to){
        double rate = from.dollarValue()/to.dollarValue();
        double val = value*rate;
        return val;
    }
    CurrencyConverter INR = () -> 74.16;
    CurrencyConverter USD = ()-> 1.0;
    CurrencyConverter UKP = ()-> 0.73;

}

public class Day1 {
    public static void main(String[] args) {
        CurrencyConverter USD = CurrencyConverter.USD;
        CurrencyConverter INR = CurrencyConverter.INR;
        CurrencyConverter UKP = CurrencyConverter.UKP;
        System.out.println(CurrencyConverter.convert(100,USD,INR));
        System.out.println(CurrencyConverter.convert(100,INR,USD));
        System.out.println(CurrencyConverter.convert(100,UKP,USD));
        System.out.println(CurrencyConverter.convert(100,INR,UKP));



    }
}

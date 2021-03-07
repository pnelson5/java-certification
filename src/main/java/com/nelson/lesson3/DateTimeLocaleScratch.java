package com.nelson.lesson3;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class DateTimeLocaleScratch {

  public static void main(String[] args) {

    BigDecimal price = BigDecimal.valueOf(10.99);
    Double tax = 0.02;
    int quantity = 1001;

    Locale locale = new Locale("en", "US");
    NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(locale);
    NumberFormat percentageFormat = NumberFormat.getPercentInstance(locale);
    NumberFormat numberFormat = NumberFormat.getNumberInstance(locale);

    System.out.println(currencyFormat.format(price));
    System.out.println(percentageFormat.format(tax));
    System.out.println(numberFormat.format(quantity));
  }
}

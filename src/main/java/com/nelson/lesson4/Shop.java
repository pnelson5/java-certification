package com.nelson.lesson4;

import com.nelson.lesson5.Rating;
import java.math.BigDecimal;

public class Shop {

  public static void main(String[] args) {

    Product p1 = new Product(101, "Tea", BigDecimal.valueOf(1.99));
    Product p2 = new Product(102, "Sugar", BigDecimal.valueOf(0.99), Rating.FOUR_STARS);
    Product p3 = new Product(102, "Cake", BigDecimal.valueOf(0.99), Rating.FIVE_STARS);

    Product p5 = p3.applyRating(Rating.THREE_STARS);

    Product p4 = new Product();

    System.out.println(
        p1.getId() + ": " + p1.getName() + ": " + p1.getPrice() + ": " + p1.getRating().getStars());
    System.out.println(
        p2.getId() + ": " + p2.getName() + ": " + p2.getPrice() + ": " + p2.getRating().getStars());
    System.out.println(
        p3.getId() + ": " + p3.getName() + ": " + p3.getPrice() + ": " + p3.getRating().getStars());
    System.out.println(
        p4.getId() + ": " + p4.getName() + ": " + p4.getPrice() + ": " + p4.getRating().getStars());
    System.out.println(
        p5.getId() + ": " + p5.getName() + ": " + p5.getPrice() + ": " + p5.getRating().getStars());

    System.out.println(p1.getDiscount());
  }
}

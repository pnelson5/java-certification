package com.nelson.lesson6;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Shop {

  public static void main(String[] args) {
    Product p1 = new Drink(101, "Tea", BigDecimal.valueOf(1.99), Rating.THREE_STARS);
    Product p2 = new Drink(102, "Coffee", BigDecimal.valueOf(1.99), Rating.FOUR_STARS);
    Product p3 =
        new Food(
            103,
            "Biscuit",
            BigDecimal.valueOf(0.99),
            Rating.FOUR_STARS,
            LocalDate.now().plusDays(7));

    Product p4 = p3.applyRating(Rating.THREE_STARS);

    //    System.out.println(
    //        "id: "
    //            + p1.getId()
    //            + " name: "
    //            + p1.getName()
    //            + " price: "
    //            + p1.getPrice()
    //            + " rating: "
    //            + p1.getRating().getStars());
    //    System.out.println(
    //        "id: "
    //            + p2.getId()
    //            + " name: "
    //            + p2.getName()
    //            + " price: "
    //            + p2.getPrice()
    //            + " rating: "
    //            + p2.getRating().getStars());
    //    System.out.println(
    //        "id: "
    //            + p3.getId()
    //            + " name: "
    //            + p3.getName()
    //            + " price: "
    //            + p3.getPrice()
    //            + " rating: "
    //            + p3.getRating().getStars());

    System.out.println(p1);
    System.out.println(p2);
    System.out.println(p3);
    System.out.println(p4);
  }
}

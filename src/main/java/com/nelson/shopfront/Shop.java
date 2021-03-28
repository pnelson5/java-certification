package com.nelson.shopfront;

import com.nelson.lesson6.ProductManager;
import com.nelson.lesson6.Rating;
import java.math.BigDecimal;
import java.util.Locale;

public class Shop {

  public static void main(String[] args) {

    ProductManager pm = new ProductManager(Locale.UK);

    pm.createProduct(101, "Tea", BigDecimal.valueOf(1.99), Rating.THREE_STARS);
    pm.createProduct(102, "Coffee", BigDecimal.valueOf(2.99), Rating.THREE_STARS);

    //    pm.printProductReport(p1);

    pm.reviewProduct(101, Rating.FIVE_STARS, "Great!");
    pm.reviewProduct(101, Rating.FIVE_STARS, "Great!");
    pm.reviewProduct(101, Rating.FIVE_STARS, "Great!");
    pm.reviewProduct(101, Rating.FIVE_STARS, "Great!");

    //    pm.printProductReport(p1);
    pm.changeLocale("en-US");
    //    pm.printProductReport(p1);
    pm.printProducts((p1, p2) -> p2.getRating().ordinal() - p1.getRating().ordinal());

    //    Product p2 = pm.createProduct(102, "Coffee", BigDecimal.valueOf(1.99),
    // Rating.FOUR_STARS);
    //    Product p3 =
    //        pm.createProduct(
    //            103,
    //            "Biscuit",
    //            BigDecimal.valueOf(0.99),
    //            Rating.FOUR_STARS,
    //            LocalDate.now().plusDays(7));
    //
    //    Product p4 = p3.applyRating(Rating.THREE_STARS);

    //    System.out.println(p1);
    //    System.out.println(p2);
    //    System.out.println(p3);
    //    System.out.println(p4);
  }
}

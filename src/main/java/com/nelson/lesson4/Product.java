package com.nelson.lesson4;

import com.nelson.lesson5.Rating;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Product {

  private static final BigDecimal DISCOUNT_RATE = BigDecimal.valueOf(0.1);

  private final int id;
  private final String name;
  private final BigDecimal price;
  private final Rating rating;

  public Product() {
    this(0, null, BigDecimal.ZERO);
  }

  public Product(int id, String name, BigDecimal price, Rating rating) {
    this.id = id;
    this.name = name;
    this.price = price;
    this.rating = rating;
  }

  public Product(int id, String name, BigDecimal price) {
    this(id, name, price, Rating.NOT_RATED);
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public BigDecimal getPrice() {
    return price;
  }

  public BigDecimal getDiscountRate() {
    return DISCOUNT_RATE;
  }

  public BigDecimal getDiscount() {
    return price.multiply(DISCOUNT_RATE).setScale(2, RoundingMode.HALF_UP);
  }

  public Rating getRating() {
    return rating;
  }

  public Product applyRating(Rating newRating) {
    return new Product(id, name, price, newRating);
  }
}

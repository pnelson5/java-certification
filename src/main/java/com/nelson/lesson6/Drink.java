package com.nelson.lesson6;

import java.math.BigDecimal;
import java.time.LocalTime;

public final class Drink extends Product {

  Drink(int id, String name, BigDecimal price, Rating rating) {
    super(id, name, price, rating);
  }

  Drink(int id, String name, BigDecimal price) {
    super(id, name, price);
  }

  @Override
  public BigDecimal getDiscount() {
    LocalTime now = LocalTime.now();
    return (now.isAfter(LocalTime.of(17, 30)) && now.isBefore(LocalTime.of(18, 30)))
        ? super.getDiscount()
        : BigDecimal.ZERO;
  }

  @Override
  public Product applyRating(Rating newRating) {
    return new Drink(getId(), getName(), getPrice(), newRating);
  }
}

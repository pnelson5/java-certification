package com.nelson.lesson6;

import com.nelson.lesson7.Rateable;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

/*
this will be the parent class which Food and Drink inherit from
 */
public abstract class Product implements Rateable<Product> {

  public static final BigDecimal DISCOUNT_RATE = BigDecimal.valueOf(0.1);
  protected int id;

  protected String name;
  protected BigDecimal price;
  protected Rating rating;

  Product() {
    this(0, null, BigDecimal.ZERO);
  }

  Product(int id, String name, BigDecimal price, Rating rating) {
    this.id = id;
    this.name = name;
    this.price = price;
    this.rating = rating;
  }

  Product(int id, String name, BigDecimal price) {
    this(id, name, price, Rating.NOT_RATED);
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  public Rating getRating() {
    return rating;
  }

  public void setRating(Rating rating) {
    this.rating = rating;
  }

  public BigDecimal getDiscount() {
    return price.multiply(DISCOUNT_RATE).setScale(2, RoundingMode.HALF_UP);
  }

  @Override
  public String toString() {
    return "Product{"
        + "id="
        + id
        + ", name='"
        + name
        + '\''
        + ", price="
        + price
        + ", discount="
        + getDiscount()
        + ", rating="
        + rating.getStars()
        + '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Product product = (Product) o;
    return id == product.id;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }
}

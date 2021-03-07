package com.nelson.lesson2;

public class Declarations {

  public static void main(String[] args) {
    byte a = 127, b = 5;
    byte c = a;

    int d = a + b;

    for (char i = 97; i < 123; i++) {
      char o = (char) (i - 40);
      System.out.println(o);
    }

    char status = 'N';
    double price = 10;
    switch (status) {
      case 'S':
        price += 1;
      case 'N':
        price += 2;
      case 'D':
        price += 4;
        break;
      case 'F':
        price = 0;
        break;
      default:
        price = 100;
    }
    System.out.println(price);
  }
}

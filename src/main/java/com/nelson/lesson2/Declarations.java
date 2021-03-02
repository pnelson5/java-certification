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
  }
}

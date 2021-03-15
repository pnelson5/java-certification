package com.nelson.lesson4;

public class Variables {

  private String name; // instance variable

  public void setName(String name) {
    // name is a local variable
    this.name = name; // variable shadowing, name::name
  }

  public String getName() {
    return name;
  }

  // variable inference ('var')
  public void doSomething() {
    var variableType = "hello";
  }
}

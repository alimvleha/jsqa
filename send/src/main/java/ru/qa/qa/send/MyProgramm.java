package ru.qa.qa.send;

public class MyProgramm {
  public static void main(String[] args) {
    hello("world");
    hello("Aleksey Alimov");
    double l = 6;
    System.out.println("Площадь квадрата " + l + " = " + area(l));
    double a = 4;
    double b = 6;
    System.out.println("Площадь треугольника " + a +" и " + b + " = " + area(a, b));
  }

  public static void hello(String somebody) {

    System.out.println("Hello," + somebody + "!");
  }

  public static double area(double len) {
    return len * len;
  }

  public static double area(double a, double b){
    return a * b;
  }

}
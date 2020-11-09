package ru.qa.send;

public class MyProgramm {
  public static void main(String[] args) {
    hello("world ey");
    hello("Aleksey Alimov");

    Square s = new Square(5);
    System.out.println("Площадь квадрата " + s.l + " = " + area(s));

    Rectangle r = new Rectangle(4,6);
    System.out.println("Площадь треугольника " + r.a + " и " + r.b + " = " + area(r));
  }

  public static void hello(String somebody) {

    System.out.println("Hello," + somebody + "!");
  }

  public static double area(Square s) {
    return s.l * s.l;
  }

  public static double area(Rectangle r) {
    return r.a * r.b;
  }

}
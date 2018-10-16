import java.util.*;
import java.lang.Math;

public class Circle extends Shape{
  private double radius;
  private Point center;
  final double pi = Math.PI;

  public Circle() {
    this(0.0, new Point(0.0, 0.0));
  }
  public Circle(double radius, Point center) {
    this.radius = radius;
    this.center = center;
  }

  @Override
  public double getArea() {
    return pi * Math.pow(radius, 2);
  }

  @Override
  public double getPerimeter() {
    return 2 * pi * radius;
  }

  public String toString(){
    StringBuilder sb = new StringBuilder();
    sb.append("Center ");
    sb.append(this.center.toString());
    sb.append(" Radius " + radius);
    return sb.toString();
  }

  public static void main(String[] args){
    Point p = new Point(2.0, -7.2);
    Circle c = new Circle(10.0, p);
    System.out.println(c.toString());
  }
}

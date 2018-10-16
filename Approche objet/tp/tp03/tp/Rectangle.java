import java.util.*;
import java.lang.Math;

public class Rectangle extends Shape{
  private final Point a;
  private final Point b;
  public Rectangle() {
    Point p = new Point(0.0, 0.0);
    a = p;
    b = p;
  }
  public Rectangle(Point a, Point b) {
    this.a = a;
    this.b = b;
  }

  private double getWidth(){
    return Math.abs(b.getX()-a.getX());
  }

  private double getHeight(){
    return Math.abs(b.getY()-b.getY());
  }
  @Override
  public double getArea() {
    return this.getWidth()*this.getHeight();
  }

  @Override
  public double getPerimeter() {
    return 2 * (this.getWidth()+this.getHeight());
  }

  public String toString(){
    StringBuilder sb = new StringBuilder();
    sb.append("A ");
    sb.append(this.a.toString());
    sb.append(" B ");
    sb.append(this.b.toString());
    return sb.toString();
  }
  public static void main(String[] argc){
    Point a = new Point(5.6, 8.5);
    Point b = new Point(5.8, 9.9);
    Rectangle r = new Rectangle(a, b);
    System.out.println(r.toString());
  }



}

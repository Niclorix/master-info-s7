import java.util.*;

public class Ellipse extends Circle {
  private double radius2;

  public Ellipse(){
    super();
    this.radius2 = 0.0;
  }

  public Ellipse(double radius, Point center,double radius2){
    super(radius, center);
    this.radius2 = radius2;
  }

  @Override
  public double getArea(){
    System.out.println("nedd to calculate area");
    return 0.0;
  }

  public double getPerimeter(){
    System.out.println("need to calculate perimeter");
    return 0.0;
  }

  public String toString(){
    StringBuilder sb = new StringBuilder(1000);
    sb.append(super.toString());
    sb.append(" Radius2 ");
    sb.append(radius2);
    return sb.toString();
  }
  public static void main(String[] args){
    Point p = new Point(5.0,-8.0);
    Ellipse e = new Ellipse(5.2, p, 53.0);
    System.out.println(e.toString());
  }
}

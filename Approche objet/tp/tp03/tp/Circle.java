import java.util.*;

public class Circle {
    Point center;
    double radius;

    public Circle(){
      Point center = new Point(0.0, 0.0);
      this.center = center;
      this.radius = 0.0;
    }

    public Circle(Point center, double radius){
      this.center = center;
      this.radius = radius;
    }

    public Point getCenter(){
      return this.center;
    }

    public double getRadius(){
      return this.radius;
    }

    public String toString(){
      StringBuilder sb = new StringBuilder();
      sb.append("Center ");
      sb.append(this.center.toString());
      sb.append(" Radius " + this.getRadius());
      return sb.toString();
    }

    public static void main(String[] args){
      Point p = new Point(2.0, -7.2);
      Circle c = new Circle(p, 10.0);
      System.out.println(c.toString());
    }
}

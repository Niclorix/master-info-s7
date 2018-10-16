import java.util.*;

public class Line {
    Point a;
    Point b;

    public Line(){
      Point p = new Point(0.0, 0.0);
      a = p;
      b = p;
    }

    public Line(Point a, Point b){
      this.a = a;
      this.b = b;
    }

    public Point getA(){
      return this.a;
    }

    public Point getB(){
      return this.b;
    }

    public String toString(){
      StringBuilder sb = new StringBuilder();
      sb.append("A=" + this.getA());
      sb.append(" B=" + this.getB());
      return sb.toString();
    }

    public static void main(String[] args){
      Point a = new Point(5.0, 2.0);
      Point b = new Point(85.0, -5.0);
      Line l = new Line(a,b);
      System.out.println(l.toString());
    }
}

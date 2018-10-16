import java.util.*;

public class Shape {
    double area;
    double perimeter;

    public Shape(){
      area = 0.0;
      perimeter = 0.0;
    }

    public Shape(double area, double perimeter){
      this.area = area;
      this.perimeter = perimeter;
    }

    public double getArea(){
      return this.area;
    }

    public double getPerimeter(){
      return this.perimeter;
    }

    public String toString(){
      StringBuilder sb = new StringBuilder();
      sb.append("Area ");
      sb.append(this.getArea());
      sb.append(" Perimeter ");
      sb.append(this.getPerimeter());
      return sb.toString();
    }

    public static void main(String[] args){
      Shape s = new Shape(5.0, 6.0);
      System.out.println(s.toString());
    }
}

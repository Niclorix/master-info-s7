public class Point{
  public double x;
  public double y;

  public Point(double x, double y){
    this.x = x;
    this.y = y;
  }

  public double getX(){return this.x;}
  public double getY(){return this.y;}

  public String toString(){
    StringBuilder sb = new StringBuilder();
    sb.append("(");
    sb.append(this.getX());
    sb.append(", ");
    sb.append(this.getY());
    sb.append(")");
    return sb.toString();
  }

  public static void main(String[] args) {
    Point test = new Point(5.0, 6.0);
    System.out.println(test.toString());
  }
}

package fr.ubordeaux.ao.domain;

public class Price{
  private int cents;

  public Price(){
    cents = 0;
  }

  public Price(int cents){
    this.cents = cents;
  }

  public int getPrice(){
    return cents;
  }

  public void setPrice(int cents){
    this.cents = cents;
  }

  @Override
  public boolean equals(Object other){
    if(!(other instanceof Price)) return false;
    Price otherPrice = (Price)other;
    return cents == otherPrice.getPrice();
  }
  /*@Override
  public int hashCode(){
    return Objects.hash(this.getPrice());
  }*/

  public String toString(){
    StringBuilder str = new StringBuilder();
    int cents = this.getPrice()%100;
    int euros = this.getPrice()/100;
    str.append(euros);
    str.append(",");
    str.append(cents);
    str.append("€");
    return str.toString();
  }

  public static void main(String[] args){
    Price p = new Price(25699);
    System.out.println(p.toString());
  }

}

package com.driver;

public class Main {
  static class Product{
    public int product(int x,int y){
      return x*y;
    }
    public int product(int x,int y, int z){
      return x*y*z;
    }
    public double product(double x,double y){
      return x*y;
    }
}
  public static void main(String[] args){
    Product p = new Product();
    System.out.println("Product of 2 Integers: "+p.product(4,5);
    System.out.println("Product of 3 Integers: "+p.product(2,3,4);
    System.out.println("Product of 2 Integers: "+p.product(4.5,2.2);
  }
}
    

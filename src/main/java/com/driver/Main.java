package com.driver;

import java.util.Scanner;

public class Main {

    static class Product {
        public int product(int x, int y) {
            return x * y;
        }

        public int product(int x, int y, int z) {
            return x * y * z;
        }

        public double product(double x, double y) {
            return x * y;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Product p = new Product();

        System.out.print("Enter first integer: ");
        int a = sc.nextInt();

        System.out.print("Enter second integer: ");
        int b = sc.nextInt();

        System.out.println("Product of two integers: " + p.product(a, b));

        System.out.print("Enter third integer: ");
        int c = sc.nextInt();

        System.out.println("Product of three integers: " + p.product(a, b, c));

        System.out.print("Enter first double: ");
        double d1 = sc.nextDouble();

        System.out.print("Enter second double: ");
        double d2 = sc.nextDouble();

        System.out.println("Product of two doubles: " + p.product(d1, d2));
    }
}

    

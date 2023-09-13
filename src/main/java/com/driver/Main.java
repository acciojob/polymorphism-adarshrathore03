package com.driver;

public class Main {
    public static void main(String[] args) {
        product p = new product();

        int ans1 = p.product(2,3);
        int ans2 = p.product(1,2,3);
        double ans3 = p.product(1.0,2.0);

        System.out.println(ans1+" "+ans2+" "+ans3);
    }
    public static  class product{
        public int product(int x,int y){
            return x*y;
        }
        public int product(int x,int y,int z){
            return x*y*z;
        }
        public double product(double x,double y){
            return x*y;
        }
    }
}
package com.maddy.patterns.demo1;

public class AdvFibo {
    public static void main(String[] args) {
        System.out.println(fiboFormula(50));
    }
     static int fiboFormula(int n){
         return (int) Math.pow((1 + Math.sqrt(5)) / 2, n);
     }
}

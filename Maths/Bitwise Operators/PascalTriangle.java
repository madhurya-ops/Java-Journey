package com.maddy.patterns.demo;

public class PascalTriangle {
    public static void main(String[] args) {
        int n = 5;
        int sum = pascalRowSum(n);
        System.out.println(sum);
    }

    private static int pascalRowSum(int n) {
        return (int)Math.pow(2, n - 1);
    }
}

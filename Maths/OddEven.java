package com.maddy.patterns.demo;

public class OddEven {
    public static void main(String[] args) {
        int n = 0;
        System.out.println(isOdd(n));
    }

    private static boolean isOdd(int n){
        return (n & 1) == 1;
    }
}

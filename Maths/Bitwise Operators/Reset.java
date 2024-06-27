package com.maddy.patterns.demo;

public class Reset {
    public static void main(String[] args) {
        int number = 15;
        int n = 3;
        System.out.println(resetBit(number, n));
    }

    private static int resetBit(int number, int n) {
        int mask = 1 << (n -1);
        mask = ~mask;
        return number & mask;
    }
}

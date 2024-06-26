package com.maddy.patterns.demo;

public class SetBits {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(setBits(n));
    }

    private static int setBits(int n) {
        int count = 0;

        while(n > 0){
         count++;
         n -= (n & -n);
        }
        return count;
    }
}

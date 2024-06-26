package com.maddy.patterns.demo;

public class PowerOfTwo {
    public static void main(String[] args) {
        int n = 0;
        System.out.println(checkPow(n));
    }
    static boolean checkPow(int n){
        if(n == 0){
            return false;
        }
        boolean ans = (n & (n - 1)) == 0;
        return ans;
    }
}

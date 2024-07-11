package com.maddy.patterns.level1;

public class DigitSum {
    public static void main(String[] args) {
        int ans = sum(05);
        System.out.println(ans);
    }

    static int sum(int n){
        if(n == 0){
            return 0;
        }
        return (n % 10) + sum(n / 10);
    }
}

package com.maddy.patterns.level1;

public class Fact {
    public static void main(String[] args) {
        int ans = fact(2);
        System.out.println(ans);
    }

    static int fact(int n){

        if(n <= 1){
            return 1;
        }
        return n * fact(n - 1);
    }
}

package com.maddy.patterns.demo1;

public class Fibo {
    public static void main(String[] args) {
        System.out.println(fibo(4 ));
    }
    static int fibo(int n){
        //base condition
        if(n < 2 && n >= 0){
            return n;
        }
        return fibo(n - 1) + fibo(n - 2);//output
    }
}

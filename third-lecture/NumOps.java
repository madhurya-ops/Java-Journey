package com.maddy.third_tutorial.Assignment;

public class NumOps {
    public static void main(String[] args) {
        int num = 234;

        int result = productOfDigits(num) - sumOfDigits(num);
        System.out.println(result);
    }
    static int productOfDigits(int num){

        int product = 1;
        while(num > 0) {
            int rem = num % 10;
            product *= rem;
            num /= 10;
        }
        return product;
    }

    static int sumOfDigits(int num){

        int sum = 0;
        while(num > 0) {
            int rem = num % 10;
            sum += rem;
            num /= 10;
        }
        return sum;
    }
}

package com.maddy.patterns.demo;

public class findUnique {
    public static void main(String[] args) {
         int[] arr = {2, 3, 4, 1, 2, 1, 3, 6, 4};
        System.out.println(isUnique(arr));
    }
    private static int isUnique(int[] arr){
        int unique = 0;
        for(int n: arr){
            unique = unique ^ n;
        }
        return unique;
    }
}

package com.maddy.linearsearch;

public class FindMin {
    public static void main(String[] args) {
        int[] arr = {23, 45 , 1, 2, 8, 19, -3, 16, -11, 28};
        System.out.println(max(arr));
    }
    //return max value in the array
    static int max(int[] arr){
        if(arr.length == 0){
            return -1;
        }
        int ans = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > ans){
                ans = arr[i];
            }
        }
        return ans;
    }
    //return min value in the array
    static int min(int[] arr){
        if(arr.length == 0){
            return -1;
        }
        int ans = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < ans){
                ans = arr[i];
            }
        }
        return ans;
    }

}

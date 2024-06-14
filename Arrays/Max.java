package com.maddy.arrays;

public class Max {
    public static void main(String[] args) {
        int[] arr = {1,4,65,3,878,};
        System.out.println(maxRange(arr, 1,3));
    }
    static int maxRange(int[] arr, int index1, int index2){
        int maxVal = arr[index1];
        for(int i = index1; i <= arr[index2]; i++){
            if(maxVal < arr[i]) {
                maxVal = arr[i];
            }
        }

        return maxVal;
    }



    static int max(int[] arr){
        int maxVal = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(maxVal < arr[i]) {
                maxVal = arr[i];
            }
        }

        return maxVal;
    }
}

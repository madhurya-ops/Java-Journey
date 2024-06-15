package com.maddy.linearsearch;

public class Main {
    public static void main(String[] args) {
        int[] arr = {23, 45 , 1, 2, 8, 19, -3, 16, -11, 28};
        int target = -11;
        int ans = linearSearch(arr, target);
        System.out.println(ans);
    }

    static int linearSearch(int[] arr, int target){

        if(arr.length == 0){
            return -1;
        }

        int index = 0;
        while(index < arr.length){
            if(target == arr[index]){
                return index;
            }
            index++;
        }
        return -1;
    }
}

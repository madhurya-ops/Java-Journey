package com.maddy.linearsearch;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {23, 45 , 1, 2, 8, 19, -3, 16, -11, 28};
        int target = 2;
        int ans = linearSearch(arr, target, 1, 4);
        System.out.println(ans);
    }
    static int linearSearch(int[] arr, int target, int start, int end){

        if(arr.length == 0){
            return -1;
        }

        int index = start;
        while(index <= end){
            if(target == arr[index]){
                return index;
            }
            index++;
        }
        return -1;
    }
}

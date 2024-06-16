package com.maddy.binarysearch.Questions;

public class RotationCount {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(rotationCount(arr));
    }

    private static int rotationCount(int[] arr) {
        int pivot = findPivot(arr);
        return pivot + 1;

}
    //use when arr does not have any duplicates
static int findPivot(int[] arr){
    int start = 0;
    int end = arr.length -1;

    while(start <= end){
        int mid = start + (end - start) / 2;

        if(mid < end && arr[mid] > arr[mid + 1]){
            return mid;
        }
        if(mid > start && arr[mid] < arr[mid -1]){
            return mid - 1;
        }
        if (arr[start] >= arr[mid]) {
            end = mid - 1;
        }
        else{
            start = mid + 1;
        }
    }
    return -1;
}
//use it when array contains duplicates
static int findPivotWithDuplicates(int[] arr){
    int start = 0;
    int end = arr.length -1;

    while(start <= end){
        int mid = start + (end - start) / 2;

        if(mid < end && arr[mid] > arr[mid + 1]){
            return mid;
        }
        if(mid > start && arr[mid] < arr[mid -1]){
            return mid - 1;
        }
        if(arr[mid] == arr[start] && arr[mid] == arr[end]){
            //check whether start is the pivot or not
            if(arr[start] > arr[start + 1]){
                return start;
            }
            start++;
            //check whether end is the pivot or not
            if(arr[end] < arr[end - 1]){
                return end -1;
            }
            end--;
        } else if (arr[start] < arr[mid] || arr[start] == arr[mid] && arr[mid] > arr[end]) {
            return start = mid + 1;
        }
        else{
            return end = mid - 1;
        }
    }
    return -1;
}
    }
package Assignment;
//https://leetcode.com/problems/kth-missing-positive-number/

public class findKthPositive {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 7, 11};
        System.out.println(findNum(arr,1));
    }

    static int findNum(int[] arr, int targetPosn){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;
            int missing = arr[mid] - mid - 1;
            if( missing < targetPosn){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return start + targetPosn; //(low = high + 1)
    }
}

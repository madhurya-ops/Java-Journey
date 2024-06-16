package com.maddy.binarysearch.Questions;

import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(Arrays.toString(search(matrix, 3)));
    }
    //this BS is to find the middle col first
    //then the middle element in that col
    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target){
        while(cStart <= cEnd){
            int mid = cStart + (cEnd - cStart) / 2;
            if(matrix[row][mid] == target){
                return new int[]{row, mid};
            }
            //simple BS applied
            if(matrix[row][mid] < target){
                cStart = mid + 1;
            }else{
                cEnd = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }
    static int[] search(int[][] matrix, int target){
        int rows = matrix.length;
        int cols = matrix[0].length;

        //in case the given matrix is empty
        if(cols == 0){
            return new int[]{-1, -1};
        }
        //in the given matrix contains only 1 row
        if(rows == 1){
            return binarySearch(matrix, 0, 0, cols -1, target);
        }

        //finding the middle col of the matrix
        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols / 2;

        //run the loop till 2 rows are remaining
        // Run the loop till 2 rows are remaining
        while(rStart < (rEnd - 1)){ // Ensures at least two rows remain
            int rMid = rStart + (rEnd - rStart) / 2;

            if(matrix[rMid][cMid] == target){
                return new int[]{rMid, cMid};
            }
            if(matrix[rMid][cMid] < target){
                rStart = rMid; // Adjusting rStart
            }else{
                rEnd = rMid; // Adjusting rEnd
            }
        }
        //now we have two rows remaining
        //check whether the target is in the mid col or not
        if (matrix[rStart][cMid] == target){
            return new int[]{rStart, cMid};
        }
        if (matrix[rStart + 1][cMid] == target){
            return new int[]{rStart + 1, cMid};
        }
        //search in 1st half
        // Search in 1st half
        if(target <= matrix[rStart][cMid - 1]){
            return binarySearch(matrix, rStart, 0, cMid - 1, target);
        }
    // Search in 2nd half
        if(target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][cols - 1]){
            return binarySearch(matrix, rStart, cMid + 1, cols - 1, target);
        }
    // Search in 3rd half
        if(target <= matrix[rStart + 1][cMid - 1]){
            return binarySearch(matrix, rStart + 1, 0, cMid - 1, target);
        }
    // Search in 4th half
        else {
            return binarySearch(matrix, rStart + 1, cMid + 1, cols - 1, target);
        }

    }
}

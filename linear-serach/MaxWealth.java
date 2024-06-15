package com.maddy.linearsearch;

public class MaxWealth {
    public static void main(String[] args) {
        int[][] accounts = {
                {1,2,3},
                {3,2,1},
                {7,3,6}
        };

        System.out.println(maximumWealth(accounts));
    }
    static int maximumWealth(int[][] account){
        int ans = Integer.MIN_VALUE;
        for(int person = 0; person < account.length; person++){
            int rowSum = 0;
            for(int bank = 0; bank < account[person].length; bank++){ //Going through every column of each row
                rowSum += account[person][bank];
            }
            if(rowSum > ans){
                ans = rowSum;
            }
        }
        return ans;
    }
}

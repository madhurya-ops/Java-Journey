package Assignment;
//https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/submissions/1297905971/

public class ShipPackages {
    public static void main(String[] args) {
        int[] weights = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(minShipCapacity(weights, 5));
    }

    static int minShipCapacity(int[] weights, int days){
        int start = findMax(weights);
        int end = sum(weights);

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(canShipInDays(weights, days, mid)){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return start;
    }

    static boolean canShipInDays(int[] weights, int days, int capacity){
        int currentWeight = 0;
        int requiredDays = 1;

        for(int weight: weights){
            if(currentWeight + weight > capacity){
                requiredDays++;
                currentWeight = 0;
            }
            currentWeight += weight;
        }
        return requiredDays <= days;
    }

    static int findMax(int[] weights){
        int n = weights.length;
        int max = 0;

        for (int weight : weights) {
            if (weight > max) {
                max = weight;
            }
        }
        return max;
    }

    static int sum(int[] weights){
        int n = weights.length;
        int sum = 0;
        for (int weight : weights) {
            sum += weight;
        }
        return sum;
    }
}

package Assignment;
//https://leetcode.com/problems/koko-eating-bananas/submissions/1297975866/

public class KokoBananas {
    public static void main(String[] args) {
        int[] piles = {3,6,7,11};
        System.out.println(minRateOfEating(piles, 8));
    }

    static int minRateOfEating(int[] piles, int hours){
        int start = 1;
        int end = findMax(piles);

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(canFinish(piles, hours, mid)){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return start;
    }

    static boolean canFinish(int[] piles, int hours, int rate){
        int hoursNeeded = 0;
        for(int pile : piles){
            hoursNeeded += (int) Math.ceil(pile / (double) rate);
        }
        return hoursNeeded <= hours;
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
}

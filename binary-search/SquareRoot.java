package Assignment;
//https://leetcode.com/problems/sqrtx/description/

public class SquareRoot {
    public static void main(String[] args) {
         int num = 18;
        System.out.println(bs(num));
    }

    static int linearSearch(int num){
        if(num == 1){
            return 1;
        }
        int ans = 1;
        for (int i = 2; i <= num; i++) {
            if(i * i <= num){
                ans = i;
            }else break;
        }
        return ans;
    }

    static int bs(int x){
        int start = 1;
        int end = x;
        int ans = 0;

        if(x == 0){
            return 0;
        }

        while(start <= end){
            int mid = start + (end - start) / 2;
            long square = (long) mid * mid;

            if(square == x){
               return mid;
            }
            if(square < x){
                ans = mid; //mid might be the floor of the square root
                start = mid + 1;
            }
            else end = mid - 1;
        }
        return ans;
    }
}

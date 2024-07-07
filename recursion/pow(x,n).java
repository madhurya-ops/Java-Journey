class Solution {
    public double myPow(double x, int n) {
        double pow = 1;

        if(n == 0){
            return 1;
        }

        if(n < 0){
            n = -n;
            x = 1 / x;
        }

        while(n != 0){
            if((n & 1) == 1){
                pow *= x;
            }
            
            x *= x;
            
            n >>>= 1;
        }
        return pow;
    }
}

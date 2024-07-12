//https://leetcode.com/problems/binary-gap/description/
class Solution {
    public int binaryGap(int n) {
        int max = 0;
        int pos = 0;
        int lastPos = -1;

        while(n != 0){
            pos++;
            if((n & 1) == 1){
                if(lastPos != -1){
                    max = Math.max(max, pos - lastPos);
                }
                lastPos = pos;
            }
            n >>= 1;
        }
        return max;
    }
}

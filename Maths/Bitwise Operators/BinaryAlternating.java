//https://leetcode.com/problems/binary-number-with-alternating-bits/
class Solution {
    public boolean hasAlternatingBits(int n) {
        return Integer.toBinaryString(n).matches("(10)*1?");
    }
}

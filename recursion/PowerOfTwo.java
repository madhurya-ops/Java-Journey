//https://leetcode.com/problems/power-of-two/description/
//solution using Bit manipulation
class Solution {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & n - 1) == 0;
    }
}

//solution using Recursion
class Solution {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n == 1 || (n % 2 == 0 && isPowerOfTwo(n / 2)));
    }
}

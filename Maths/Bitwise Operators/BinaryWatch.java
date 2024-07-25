//https://leetcode.com/problems/binary-watch/description/
class Solution {
    public List<String> readBinaryWatch(int num) {
        List<String> result = new ArrayList<String>();
        
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 60; j++) {
                if (hDist(i) + hDist(j) == num) {
                    result.add(String.format("%d:%02d", i, j));
                }
            }
        }
        
        return result;
    }
    
	// Count bits with Hamming Distance
    public int hDist(int num) {
        int ans = 0;
        
        while (num != 0) {
            ans++;
            num = num & (num - 1);
        }
        
        return ans;
    }
}

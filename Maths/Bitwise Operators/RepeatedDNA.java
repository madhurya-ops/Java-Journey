//https://leetcode.com/problems/repeated-dna-sequences/
class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        HashSet<String> ans = new  HashSet<>();
        HashSet<String> enconter = new HashSet<>();

        for(int i=0;i<s.length()-9;i++){
            String dna = s.substring(i, i+10);
            if(enconter.contains(dna))  ans.add(dna);
            enconter.add(dna);
        }
        return new ArrayList(ans);
    }
}

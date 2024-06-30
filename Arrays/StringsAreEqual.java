package com.maddy.arrays.Assignment;

public class StringsAreEqual {
    public static void main(String[] args) {
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};
        System.out.println(arrayStringsAreEqual(word1, word2));
    }

    static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();

        for(String word: word1){
            str1.append(word);
        }
        for(String word: word2){
            str2.append(word);
        }

        String s1 = str1.toString();
        String s2 = str2.toString();

        return s1.equals(s2);
    }
}

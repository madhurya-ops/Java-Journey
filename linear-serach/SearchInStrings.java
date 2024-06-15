package com.maddy.linearsearch;

public class SearchInStrings {
    public static void main(String[] args) {
        String name = "Carlos";
        char target = 'C';
        boolean ans = checkTarget(name, target);
        System.out.println(ans);
    }
    static boolean checkTarget(String names, char target){
        if(names.length() == 0){
            return false;
        }
        for(int i = 0; i < names.length(); i++){
            if(names.charAt(i) == target){
                return true;
            }
        }
        return false;
    }
}

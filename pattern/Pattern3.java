package com.maddy.patterns.pattern;

public class Pattern3 {
    public static void main(String[] args) {
        pattern28(5);
    }
    static  void pattern3(int n){
        for (int row = n; row >= 0; row--) {
            for (int col = 0; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static  void pattern4(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row ; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n){
        for (int row = 0; row <= 2 * n - 1; row++) {
            int totalColsInRow = row > n ? 2 * n - row : row; //ternary operator
            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern28(int n){
        for (int row = 0; row <= 2 * n - 1; row++) {
            int totalColsInRow = row > n ? 2 * n - row : row;
            int noOfSpaces = n - totalColsInRow;

            for (int s = 0; s <= noOfSpaces; s++) {
                System.out.print(" ");
            }

            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

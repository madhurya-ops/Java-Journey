package com.maddy.arrays;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the names: ");

        //Array of primitives:
//        int[] arr = new int[5];
//        arr[0] = 75;
//        arr[1] = 7;
//        arr[2] = 545;
//        arr[3] = 654;
//        arr[4] = 132;

//        System.out.println(arr[3]);

//        for(int i = 0; i < arr.length; i++){
//            arr[i] = in.nextInt();
//        }
//
//        System.out.println(Arrays.toString(arr));

//        for(int i = 0; i < arr.length; i++){
//            System.out.print(arr[i] + " ");
//        }

        //Array of objects
        String[] names = new String[4];
        for(int i = 0; i < names.length; i++){
             names[i] = in.next();
        }
        System.out.println(Arrays.toString(names));
    }
}

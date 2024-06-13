package com.maddy._4thtutuorial;
import java.util.Scanner;

public class Methods {
    public static void main(String[] args){
        sum();
    }

    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number one: ");
        int num1 = in.nextInt();
        System.out.print("Enter number two: ");
        int num2 = in.nextInt();

        int sum = num1 + num2;

        System.out.println("The sum is: " + sum);

    }
}

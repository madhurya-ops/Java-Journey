package com.maddy.third_tutorial;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args){

        System.out.print("Enter a fruit: ");
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

        switch (fruit){
            case "Mango":
                System.out.println("King of fruits.");
                break;
            case "Apple":
                System.out.println("Might as well make a fizz.");
                break;
            case "Orange":
                System.out.println("Can rhyme with anything.");
                break;
            case "Grape":
                System.out.println("Good wine.");
                break;
            default:
                System.out.println("Enter a valid fruit");
        }
    }
}

package com.maddy._4thtutuorial;
import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int num = in.nextInt();
//        boolean ans = isPrime(num);
//        System.out.println(ans);

//          boolean ans = isArmstrong(num);
//          System.out.println(ans);

          for(int i = 100; i < 1000; i++){
              if(isArmstrong(i)){
                  System.out.println(i + " ");
              }
          }
    }

    static boolean isArmstrong(int num){
        int original = num;
        int sum = 0;

        while(num > 0 ){
            int rem = num % 10;
            num /= 10;
            int cube = rem*rem*rem;
            sum += cube;
        }
        return sum == original;
    }

    static boolean isPrime(int num){
        if(num <= 1){
            return false;
        }
        int middleDigit = num / 2;
        int i = 2;
        while(i <= middleDigit){
            if(num % i == 0){
                return false;
            }
            i++;
        }
        return true;
    }
}

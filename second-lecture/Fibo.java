import java.util.Scanner;
public class Fibo {
    public static void main(String[] args){

        System.out.print("Enter a number: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println("Fibonacci series of " + n + "th number");

        int a = 0;
        int b = 1;

        for(int count = 2; count <= n; count++) {
            int temp = b;
            b = b + a;
            a = temp;
        }
        System.out.print(b);
//        if(n == 0){
//            System.out.println("Enter a value greater than zero");
//        }else if(n == 1){
//            System.out.println(b);
//        }else{
//
//        }
    }
}

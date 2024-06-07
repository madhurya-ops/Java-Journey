package assignment;
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = in.nextInt();

        int product = 0;
        for(int i = 1; i <= 10; i++){
            product = num * i;
            System.out.println(num + " X " + i + " = " + product);
        }
    }
}

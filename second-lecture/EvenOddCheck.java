package Assignment;
import java.util.Scanner;

public class EvenOddCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = in.nextInt();

        if(num % 2 == 0){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }

    }
}

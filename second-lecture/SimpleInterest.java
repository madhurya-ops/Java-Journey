package Assignment;
import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Principle: ");
        int principle = in.nextInt();
        System.out.println();
        System.out.print("Rate(as percentage): ");
        int rate = in.nextInt();
        System.out.println();
        System.out.print("Time(in years): ");
        int time = in.nextInt();





        int simpleInsterest = (principle * rate * time) / 100;
        System.out.print("Simple interest = " + simpleInsterest);
    }
}

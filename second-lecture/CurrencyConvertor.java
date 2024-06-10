package Assignment;
import java.util.Scanner;
public class CurrencyConvertor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter currency in rupees: ");
        double rupees = in.nextInt();

        double usd = rupees * 0.012;
        System.out.println("INR in USD =  $" + usd);
    }
}

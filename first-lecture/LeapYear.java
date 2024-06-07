package assignment;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.print("Enter a year: ");
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        boolean ans = leapYear(year);
        System.out.println(ans);

    }
    static boolean leapYear(int year){
        return (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
    }

}

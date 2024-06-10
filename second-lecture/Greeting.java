package Assignment;
import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        System.out.println("Hey! What's your name?");
        Scanner in = new Scanner(System.in);
        String name = in.next();

        System.out.println("Greetings " + name);

    }
}

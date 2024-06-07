import java.util.Scanner;
public class Temperature {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temperature in fahrenheit: ");
        float tempF = input.nextFloat();

        float tempC = (tempF - 32) * ((float) 5 /9);
        System.out.println(tempF + " Fahrenheit in degree celcius = " + tempC);
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        int salary = 25499;

        if(salary > 15000){
            salary += 2000;
        }else{
            salary += 1000;
        }

        System.out.println(salary);
    }
}

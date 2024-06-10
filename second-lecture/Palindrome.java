package Assignment;

public class Palindrome {
    public static void main(String[] args) {
        String word = "level";
        System.out.println(check(word));
    }
    static boolean check(String word){
        String reversed = "";

        int length = word.length();

        int index = length -1;

        while(index >= 0){

            reversed += word.charAt(index);

            index--;
        }

        return word.equals(reversed);
    }
}

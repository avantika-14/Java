import java.util.Scanner;

public class ReciprocalOfLetters {

    public static String reciprocalString(String s){

        StringBuilder result = new StringBuilder();

        for(char c : s.toCharArray()){

            if (c >= 'a' && c <= 'z')
                result.append((char) ('z' - (c - 'a')));

            else if (c >= 'A' && c <= 'Z')
                result.append((char) ('Z' - (c - 'A')));

            else
                result.append(c);
        }

        return result.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        System.out.println("Reciprocal of the string is: " +reciprocalString(s));
    }
}

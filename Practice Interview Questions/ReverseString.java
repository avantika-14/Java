// https://www.geeksforgeeks.org/problems/string-reversalunpublished-for-now5324/1

import java.util.HashSet;
import java.util.Scanner;

public class ReverseString {

    public static String stringReverse(String str) {

        StringBuilder reversed = new StringBuilder();
        HashSet<Character> flag = new HashSet<>();

        for(int i = str.length() - 1; i >= 0; i--) {

            char c = str.charAt(i);

            if (c == ' ')
                continue;

            if (!flag.contains(c)) {
                flag.add(c);
                reversed.append(c);
            }
        }

        return reversed.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("the reversed string with no repeated characters is: " +stringReverse(str));
    }
}

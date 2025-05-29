// https://www.geeksforgeeks.org/problems/run-length-encoding/1

import java.util.Scanner;

public class RunLengthEncoding {

    public static String encode(String s) {
        // code here

        StringBuilder res = new StringBuilder();

        for (int i = 0; i < s.length();) {

            int count = 1;

            // checking the amount of occurence of the character
            while(((i + count) < s.length() && (s.charAt(i) == s.charAt(i + count))))
                count++;

            //adding the character and its count to the new string
            res.append(s.charAt(i)).append(count);

            // incrementing i by count because those elements/characters are already added
            i += count;
        }

        return res.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string to encode: ");
        String input = sc.nextLine();

        System.out.println("Run-Length Encoded String: " +encode(input));
    }
}

// https://www.geeksforgeeks.org/problems/check-if-a-string-is-isogram-or-not-1587115620/1

import java.util.Scanner;

public class Isogram {

    public static boolean isIsogram(String s) {

        boolean[] check = new boolean[26];

        for (char ch : s.toLowerCase().toCharArray()) {

            if (ch >= 'a' && ch <= 'z') {

                int index = ch - 'a';

                if (check[index])
                    return false;

                check[index] = true;
            }
        }

        return true;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        System.out.println("Isogram? " +isIsogram(s));
    }
}

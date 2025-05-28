//https://www.geeksforgeeks.org/problems/anagram-1587115620/1

import java.util.Scanner;

public class StringAnagram {

    public static boolean isAnagram(String a, String b) {

        if (a.length() != b.length())
            return false;

        int[] count = new int[26];

        for (int i = 0; i < a.length(); i++)
            count[a.charAt(i) - 'a']++;


        for (int i = 0; i < b.length(); i++)
            count[b.charAt(i) - 'a']--;

        for (int i = 0; i < 26; i++) {
            if (count[i] != 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first string:");
        String a = sc.nextLine().toLowerCase(); // converting to lowercase if needed

        System.out.println("Enter second string:");
        String b = sc.nextLine().toLowerCase();

        if (isAnagram(a, b))
            System.out.println("The strings are anagrams.");
        else
            System.out.println("The strings are not anagrams.");

    }
}

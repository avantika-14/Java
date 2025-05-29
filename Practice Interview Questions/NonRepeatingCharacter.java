//https://www.geeksforgeeks.org/problems/non-repeating-character-1587115620/1

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class NonRepeatingCharacter {

    public static char nonRepeating(String s) {

        //using linked hashmap so that the insertion order is maintained
        Map<Character,Integer> frequency = new LinkedHashMap<>();

        for(char c : s.toCharArray())
            frequency.put(c, frequency.getOrDefault(c,0) + 1);

        for(char c : s.toCharArray()){
            if (frequency.get(c) == 1)
                return c;
        }

        return '$';

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        System.out.println(nonRepeating(s));
    }
}

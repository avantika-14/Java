// https://www.geeksforgeeks.org/problems/remove-character3815/0

import java.util.HashSet;

public class RemoveCharacters {
    public static String removeChars(String str1, String str2) {
        HashSet<Character> set = new HashSet<>();

        // add removable characters to set
        for (char c : str2.toCharArray())
            set.add(c);

        StringBuilder result = new StringBuilder();

        // enter elements in result by skipping the characters in set
        for (char c : str1.toCharArray()) {
            if(!set.contains(c))
                result.append(c);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeChars("geeksforgeeks", "mask"));
    }
}

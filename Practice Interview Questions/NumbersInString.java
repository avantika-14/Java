//https://www.geeksforgeeks.org/problems/sum-of-numbers-in-string-1587115621/1

public class NumbersInString {

    public static int findSum (String s) {

        int sum = 0;
        int num = 0;

        for (int i = 0; i < s.length(); i++) {
             char c = s.charAt(i);

             if (Character.isDigit(c))
                 num = num * 10 + (c - '0');

             else {
                 sum += num;
                 num = 0;
             }
        }

        sum += num;
        return sum;
    }

    public static void main(String[] args) {
        String input = "abc123xyz45";
        System.out.println(findSum(input));
    }
}

// https://www.geeksforgeeks.org/problems/red-or-green5711/1

import java.util.Scanner;

public class RedOrGreen {

    static int RedOrGreen(int N, String S) {
        // code here
        int countR = 0, countG = 0;

        for(char ch : S.toCharArray()){

            if (ch == 'R')
                countR++;

            else
                countG++;
        }

        return Math.min(countR, countG);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string length:");
        int n = sc.nextInt();

        System.out.println("Enter String: ");
        String s = sc.next();

        System.out.println("the minimum number of colour needed to be changed is: " +RedOrGreen(n, s));
    }
}

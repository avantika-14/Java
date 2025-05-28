// https://www.geeksforgeeks.org/problems/gcd-of-two-numbers3459/1

import java.util.Scanner;

public class GCD {

    public static int gcdOfTwoNumbers(int a, int b) {

        if (b == 0) return a;

        return gcdOfTwoNumbers(b, a % b);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 2 numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("GCD of two numbers " +a+ " and " +b+ " is: " + gcdOfTwoNumbers(a, b));
    }
}

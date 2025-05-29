// https://www.geeksforgeeks.org/problems/maximum-money2855/1

import java.util.Scanner;

public class HouseRobber {

    public static int maximizeMoney(int n, int k) {

        // For even N, say N = 4, the max houses you can rob = 4 / 2 = 2
        // For odd N, say N = 5, if you just do 5 / 2, you get 2 — but actually you can rob 3 houses (e.g., house 1, 3, and 5)
        return ((n + 1) / 2) * k;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of houses : ");
        int n = sc.nextInt();

        System.out.println("Enter the amount of money  : ");
        int m = sc.nextInt();

        System.out.println("the amount robbed: "+maximizeMoney(n, m));
    }
}

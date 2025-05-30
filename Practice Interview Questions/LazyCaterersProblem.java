// https://www.geeksforgeeks.org/problems/the-lazy-caterers-problem2527/1

import java.util.Scanner;

public class LazyCaterersProblem {

    public static int maximumPieces (int n){
        return (int)(long) n * (n + 1) / 2 + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number of cuts in the cake:");
        int n = sc.nextInt();

        System.out.println("the maximum number of pieces in the cake: " +maximumPieces(n));
    }
}

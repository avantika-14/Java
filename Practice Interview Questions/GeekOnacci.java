// https://www.geeksforgeeks.org/problems/geek-onacci-number-1611829559/0

import java.util.Scanner;

public class GeekOnacci {

    public static int GeekOnacciFunction(int n, int a, int b, int c){

        if (n == 1)
            return a;
        if (n == 2)
            return b;
        if (n == 3)
            return c;

        int temp = 0;

        for(int i = 4; i <= n; i++) {
            temp = ((a + b) % 1000000007 + c) % 1000000007;
            a = b;
            b = c;
            c = temp;
        }

        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;

        System.out.println("Enter the number of test cases: ");
        int t = sc.nextInt();

        while (t-- > 0) {
            System.out.println("enter first element (A):");
            int a = sc.nextInt();

            System.out.println("enter second element (B):");
            int b = sc.nextInt();

            System.out.println("enter third element (C):");
            int c = sc.nextInt();

            System.out.println("enter the position (n):");
            int n = sc.nextInt();

            System.out.println("the geek-onacci number for the test case " +i+ " is:");
            i++;

            System.out.println(GeekOnacciFunction(n, a, b, c));
        }
    }
}

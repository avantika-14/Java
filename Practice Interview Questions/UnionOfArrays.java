// https://www.geeksforgeeks.org/problems/union-of-two-arrays3538/1

import java.util.HashSet;
import java.util.Scanner;

public class UnionOfArrays {

    public static int findUnion(int a[], int b[]) {
        // code here
        HashSet<Integer> set = new HashSet<>();

        // Add elements of first array
        for (int i = 0; i < a.length; i++) {
            set.add(a[i]);
        }

        // Add elements of second array
        for (int i = 0; i < b.length; i++) {
            set.add(b[i]);
        }

        // Set contains only unique elements
        return set.size();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for first array
        System.out.println("Enter size of first array:");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();


        // Input for second array
        System.out.println("Enter size of second array:");
        int m = sc.nextInt();

        int[] b = new int[m];

        System.out.println("Enter elements of second array:");
        for (int i = 0; i < m; i++)
            b[i] = sc.nextInt();


        System.out.println("Number of distinct elements in union: " + findUnion(a, b));
    }
}

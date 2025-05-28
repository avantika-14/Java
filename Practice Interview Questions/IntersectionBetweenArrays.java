// https://www.geeksforgeeks.org/problems/intersection-of-two-arrays2404/1

import java.util.HashSet;
import java.util.Scanner;

public class IntersectionBetweenArrays {

    public static int intersection(int[] a, int[] b) {

        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> intersection = new HashSet<>();

        for(int i = 0; i < a.length; i++)
            set.add(a[i]);

        for (int i = 0; i < b.length; i++){
            if (set.contains(b[i]))
                intersection.add(b[i]);
        }

        return intersection.size();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read size of array A
        System.out.println("Enter size of first array:");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // Read size of array B
        System.out.println("Enter size of second array:");
        int m = sc.nextInt();
        int[] b = new int[m];
        System.out.println("Enter elements of second array:");
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }

        System.out.println("Count of distinct elements in intersection: " + intersection(a, b));

    }
}

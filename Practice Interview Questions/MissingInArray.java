// https://www.geeksforgeeks.org/problems/missing-number-in-array1416/1

import java.util.Scanner;

public class MissingInArray {

    static int missingNum(int arr[]) {
        // code here
        long n = arr.length + 1;  // since one number missing

        long totalSum = n * (n + 1) / 2;

        long arrSum = 0;
        for (int num : arr) {
            arrSum += num;
        }

        return (int) (totalSum - arrSum);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();  // User inputs n - 1 numbers

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements (from 1 to " + (n + 1) + " with one missing):");

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();


        System.out.println("Missing number is: " + missingNum(arr));
    }
}

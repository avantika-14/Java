// https://www.geeksforgeeks.org/problems/form-a-number-divisible-by-3-using-array-digits0717/1

import java.util.Scanner;

public class DivisibleBy3 {

    static int isPossible(int N, int arr[]) {
        // code here

        long sum = 0;

        for(int digit : arr)
            sum += digit;

        return (sum % 3 == 0) ? 1 : 0;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("enter elements: ");
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.println("are the numbers divisible by 3? (0 for no, 1 for yes): " +isPossible(n, arr));
    }
}

import java.util.ArrayList;
import java.util.Scanner;

public class MaxSumSubArrayOfK {

    public static int maximumSumSubarray(int[] arr, int k) {
        // Code here
        long maxSum = 0;
        long currentSum = 0;

        for (int i = 0; i < k; i++)
            currentSum += arr[i];

        maxSum = currentSum;

        for(int i = 1; i < (arr.length - k + 1); i++){
            currentSum = currentSum - arr[i - 1] + arr [i + k - 1];
            if (maxSum < currentSum)
                maxSum = currentSum;
        }

        return (int)maxSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements:");

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.println("Enter the value of K:");
        int k = sc.nextInt();

        System.out.println("Maximum sum of subarray of size " + k + " is: " + maximumSumSubarray(arr, k));
    }
}

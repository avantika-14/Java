//https://www.geeksforgeeks.org/problems/key-pair5616/1

import java.util.HashSet;
import java.util.Scanner;

public class PairWithGivenSum {

    public static boolean TwoPair(int arr[], int target){
        HashSet set = new HashSet();

        for(int i = 0; i < arr.length; i++){

            if (set.contains(target - arr[i]))
                return true;

            set.add(arr[i]);
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements in the array: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("enter target sum: ");
        int target = sc.nextInt();

        boolean result = TwoPair(arr, target);

        if (result)
            System.out.println("Yes the pair exists");
        else
            System.out.println("No the pair doesn't exists");
    }
}

// https://www.geeksforgeeks.org/problems/bitonic-generator-sort3343/1

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BitonicGeneratorSort {

    public static ArrayList<Integer> bitonicGenerator(int arr[]) {

        ArrayList<Integer> oddList = new ArrayList<>();
        ArrayList<Integer> evenList = new ArrayList<>();

        for(int i = 0; i < arr.length; i++){
            if (i % 2 == 0)
                evenList.add(arr[i]);
            else
                oddList.add(arr[i]);
        }

        Collections.sort(evenList);
        Collections.sort(oddList, Collections.reverseOrder());

        ArrayList<Integer> result = new ArrayList<>();

        result.addAll(evenList);
        result.addAll(oddList);

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();

        System.out.println("Enter the array elements: ");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.println("the bitonic array is: " + bitonicGenerator(arr));
    }
}

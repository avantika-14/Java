// https://www.geeksforgeeks.org/problems/rope-cutting3334/1

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RopeCutting {

    public static ArrayList ropeCutting(int[] arr) {

        Arrays.sort(arr);
        ArrayList ropeCutting = new ArrayList();

        for(int i = 1; i < arr.length; i++){
            if (arr[i] != arr[i - 1])
                ropeCutting.add(arr.length - i);
        }
        return ropeCutting;

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();

        System.out.println("Enter the elements of the array: ");
        int[] arr = new int[n];

        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.println("the array after rope cutting" +ropeCutting(arr));
    }
}

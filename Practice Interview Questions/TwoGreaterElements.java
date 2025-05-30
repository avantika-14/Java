import java.util.Arrays;
import java.util.Scanner;

public class TwoGreaterElements {
    public static long[] findElements(int[] arr) {

        Arrays.sort(arr);

        long[] result = new long[arr.length - 2];

        for(int i = 0; i < arr.length - 2; i++)
            result[i] = arr[i];

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();

        System.out.println("Enter the elements of the array: ");
        int[] arr = new int[n];

        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.println("the array after removing largest and second largest number is: " +Arrays.toString(findElements(arr)));
    }
}

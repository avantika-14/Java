import java.util.Scanner;

public class GapSum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements in the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.println("Enter the gap: ");
        int gap = sc.nextInt();

        for(int i = 0; i < gap; i++){
            int sum = 0;

            for(int j = i; j < n; j += gap)
                sum += arr[j];

            System.out.println(sum+ " ");
        }
    }
}

package linearSearch;

import java.util.Scanner;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {45, 76, 3, 2, -1, 7, 8, 3, 2, 23};
        int target = 2;
        Scanner sc = new Scanner(System.in);
        int begin = sc.nextInt();
        int end = sc.nextInt();
        if (begin < end){
            int ans = linearSearch(arr,target,begin,end);
            System.out.println(ans);
        }
        else
            System.out.println("No");
    }
    public static int linearSearch(int[] arr, int target, int begin, int end) {
        for (int i = begin; i < end; i++) {
            if (arr[i] == target)
                return i;
        }
        return -1;
    }
}

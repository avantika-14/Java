package binarySearch;

public class Search {
    public static void main(String[] args) {
        int[] arr = {3,5,9,34,117,568,890,907};
        int target = 3;
        int ans = binarySearch(arr,target);
        System.out.println(ans);
    }
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while(start <= end) {
            int mid = start + (end - start)/ 2;
            if(arr[mid] > target)
                end = mid - 1;
            else if(arr[mid] < target)
                start = mid + 1;
            else
                return mid;
        }
        return -1;
    }

}

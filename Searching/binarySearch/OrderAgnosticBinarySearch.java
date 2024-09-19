package binarySearch;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = {3,5,9,34,117,568,890,907};
        int target = 3;
        int ans = OrderAgnosticBS(arr,target);
        System.out.println(ans);
    }
    static int OrderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean asc = arr[start] < arr[end];

        while(start <= end) {
            int mid = start + (end - start)/ 2;
            if (target == arr[mid])
                    return mid;
            if(asc == true) {
                if (arr[mid] > target)
                    end = mid - 1;
                else if (arr[mid] < target)
                    start = mid + 1;
            }
            else if (asc == false){
                if (arr[mid] < target)
                    end = mid - 1;
                else if(arr[mid] > target)
                    start = mid + 1;
            }
        }
        return -1;
    }
}

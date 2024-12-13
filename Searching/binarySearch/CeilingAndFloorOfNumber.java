package binarySearch;

public class CeilingAndFloorOfNumber {
    //ceiling - index of smallest number >= target number
    //floor - index of greatest number <= target number
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 20;
        int ans = Ceiling(arr,target);
        int res = Floor(arr,target);
        System.out.println(ans);
        System.out.println(res);
    }
    static int Ceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        //case - target is greater than the greatest number in array
        if  (target > arr[end]) {
            return -1;
        }
        while(start <= end) {
            int mid = start + (end - start)/ 2;
            if(arr[mid] > target)
                end = mid - 1;
            else if(arr[mid] < target)
                start = mid + 1;
            else
                return mid;
        }
        return start;
    }
    static int Floor(int[] arr, int target) {
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
        return end;
    }
}

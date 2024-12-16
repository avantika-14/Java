package binarySearch;

public class SearchInRotatedArrayWithRepetition {
    public static void main(String[] args) {
        int[] nums = {4, 5, 5, 6, 7, 7, 0, 1, 2};
        System.out.println(search(nums, 0));
    }
    public static int search(int[] nums, int target) {
        int pivot = findPivotWithDuplicates(nums);
        if (pivot == -1) //the array is not rotated
            return binarySearch(nums, target, 0, nums.length - 1);
        //pivot is found, there are 2 ascending arrays
        if (nums[pivot] == target)
            return pivot;
        //cases
        if (target >= nums[0])
            return binarySearch(nums, target, 0, pivot -1);
        else
            return binarySearch(nums, target, pivot + 1, nums.length - 1);
    }
    static int binarySearch(int[] nums, int target, int start, int end){
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target < nums[mid])
                end = mid - 1;
            else if (target > nums[mid])
                start = mid + 1;
            else
                return mid;
        }
        return -1;
    }
//    //without duplicate values
//    static int findPivot(int[] nums) {
//        int start = 0;
//        int end = nums.length - 1;
//        while (start <= end){
//            int mid = start + (end - start)/2;
//            //cases
//            if (mid < end && nums[mid] > nums[mid + 1])
//                return mid;
//            if (start < mid && nums[mid] < nums[mid - 1])
//                return mid - 1;
//            if(nums[start] >= nums[mid])
//                end = mid - 1;
//            else
//                start = mid + 1;
//        }
//        return -1;
//    }
    //with duplicate values
    static int findPivotWithDuplicates(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end){
            int mid = start + (end - start)/2;
            //cases
            if (mid < end && nums[mid] > nums[mid + 1])
                return mid;
            if (start < mid && nums[mid] < nums[mid - 1])
                return mid - 1;
            //if elements at middle, start, end are same; skip the duplicates
            if(nums[mid] == nums[start] && nums[mid] == nums[end]){
                //what if the elements at start and end were pivots:
                if(start < end && nums[start] > nums[start + 1]) //checking if the start is pivot
                    return start;
                start++;
                if (end > start && nums[end] < nums[end - 1]) //checking if the end is pivot
                    return end;
                end--;
            }
            //left side is sorted so pivot should be in right
            else if (nums[start] < nums[mid] || nums[start] == nums[mid] && nums[mid] > nums[end])
                start = mid + 1;
            else
                end = mid - 1;
        }
        return -1;
    }
}

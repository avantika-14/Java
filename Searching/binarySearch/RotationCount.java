package binarySearch;

public class RotationCount {
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int pivot = findPivot(nums);
        System.out.println(pivot + 1);
    }

    //without duplicates
    static int findPivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end){
            int mid = start + (end - start)/2;
            //cases
            if (mid < end && nums[mid] > nums[mid + 1])
                return mid;
            if (start < mid && nums[mid] < nums[mid - 1])
                return mid - 1;
            if(nums[start] >= nums[mid])
                end = mid - 1;
            else
                start = mid + 1;
        }
        return -1;
    }

    //with duplicates
//    static int findPivotWithDuplicates(int[] nums) {
//        int start = 0;
//        int end = nums.length - 1;
//        while (start <= end){
//            int mid = start + (end - start)/2;
//            //cases
//            if (mid < end && nums[mid] > nums[mid + 1])
//                return mid;
//            if (start < mid && nums[mid] < nums[mid - 1])
//                return mid - 1;
//            //if elements at middle, start, end are same; skip the duplicates
//            if(nums[mid] == nums[start] && nums[mid] == nums[end]){
//                //what if the elements at start and end were pivots:
//                if(start < end && nums[start] > nums[start + 1]) //checking if the start is pivot
//                    return start;
//                start++;
//                if (end > start && nums[end] < nums[end - 1]) //checking if the end is pivot
//                    return end;
//                end--;
//            }
//            //left side is sorted so pivot should be in right
//            else if (nums[start] < nums[mid] || nums[start] == nums[mid] && nums[mid] > nums[end])
//                start = mid + 1;
//            else
//                end = mid - 1;
//        }
//        return -1;
//    }
}

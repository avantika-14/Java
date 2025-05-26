public class RemoveDuplicates {

    public static int removeDuplicatesInSortedArray(int[] nums) {
        if (nums == null || nums.length == 0)
            return -1;

        int j = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i];
            }
        }

        return j + 1;
    }

    public static void main(String[] args) {
        int [] arr = {1, 1, 2, 2, 2, 2, 6, 7, 7, 8, 9, 27};
        System.out.println("the number of elements in sorted array without duplicates is: " +removeDuplicatesInSortedArray(arr));
    }
}

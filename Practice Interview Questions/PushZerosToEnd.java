// https://www.geeksforgeeks.org/problems/move-all-zeroes-to-end-of-array0751/1

import java.util.Arrays;

public class PushZerosToEnd {

    public static void moveZeroes(int[] nums) {
        int index = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != 0) {
                if (index != i) {
                    int temp = nums[i];
                    nums[i] = nums[index];
                    nums[index] = temp;
                }

                index++;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 0, 4, 0, 9, 1, 0};
        moveZeroes(arr);
        System.out.println("array with zeroes at right: " + Arrays.toString(arr));
    }
}

//https://www.geeksforgeeks.org/problems/second-largest3735/1

public class SecondLargestElement {

    public static int getSecondLargest(int[] arr) {
        // code here
        int max = -1;
        int secondmax = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondmax = max;
                max = arr[i];
            }
            else if (arr[i] > secondmax && arr[i] != max)
                secondmax = arr[i];
        }
        return secondmax;
    }
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 3, 1};
        System.out.println("the second largest element in the array is: "+getSecondLargest(arr));
    }
}

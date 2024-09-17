import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4,5,3,21,2};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int larg = arr.length - i -1; //index of position of the largest value
            int maxIndex = getMaxIndex(arr,0,larg); //index of the largest value
            swap(arr,maxIndex,larg);
        }
    }
    public static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

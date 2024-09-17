package linearSearch;

public class Search {
    public static void main(String[] args) {
        int[] arr = {45, 76, 3, 2, -1, 7, 8, 3, 2, 23};
        int target = 2;
        int ans = linearSearch(arr,target);
        System.out.println(ans);
    }
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                return i;
        }
        return -1;
    }
}

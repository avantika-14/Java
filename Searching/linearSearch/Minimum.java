package linearSearch;

public class Minimum {
    public static void main(String[] args) {
        int[] arr = {45, 76, 3, 2, -1, 7, 8, 3, 2, 23};
        int ans = Minimum(arr);
        System.out.println(ans);
    }
    public static int Minimum(int[] arr) {
        int ans = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}

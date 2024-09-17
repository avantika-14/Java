package linearSearch;

public class SearchIn2D {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9, 10, 45},
                {11, 12, 13, 14, 15}
                };
        int target = 15;
        System.out.println(search(arr, target));
    }
    public static int search(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    return i;
                }
            }
        }
        return -1;
    }
}

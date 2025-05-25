//https://www.geeksforgeeks.org/problems/leaders-in-an-array-1587115620/1

import java.util.ArrayList;
import java.util.Collections;

public class LeaderInArray {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> leader = new ArrayList();
        int max = -1;

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] >= max) {
                max = arr[i];
                leader.add(arr[i]);
            }
        }
        Collections.reverse(leader);
        return leader;
    }
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        System.out.println("Leaders in the array: "+leaders(arr));
    }
}

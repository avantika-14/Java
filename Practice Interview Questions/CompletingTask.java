// https://www.geeksforgeeks.org/problems/completing-tasks0454/1

import java.util.ArrayList;
import java.util.List;

public class CompletingTask {
    static List<List<Integer>> findTasks(int[] arr, int k) {
        // code here
        int[] completed = new int[k];

        for(int i : arr)
            completed[i - 1] = 1;

        List<Integer> tanya = new ArrayList<>();
        List<Integer> manya = new ArrayList<>();

        boolean isTanya = true;

        for(int i = 0; i < k; i++){
            if(completed[i] == 0){

                if(isTanya)
                    tanya.add(i + 1);
                else
                    manya.add(i + 1);

                isTanya = !isTanya;
            }
        }

        List<List<Integer>> result = new ArrayList<>();

        result.add(tanya);
        result.add(manya);

        return result;
    }

    public static void main(String[] args) {

        int[] completedTasks = {2, 5, 6, 7, 9, 4};
        int totalTasks = 15;

        List<List<Integer>> result = findTasks(completedTasks, totalTasks);

        System.out.println("Tanya's Tasks: " + result.get(0));
        System.out.println("Manya's Tasks: " + result.get(1));
    }
}

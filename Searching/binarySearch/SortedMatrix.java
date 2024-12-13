package binarySearch;

import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {
        int[][] mat= {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        int target = 30;
        System.out.println(Arrays.toString(search(mat, target)));
    }
    //to search in the row between the columns provided
    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target){
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;
            if (matrix[row][mid] == target)
                return new int[]{row,mid};
            if (matrix[row][mid] < target)
                cStart = mid + 1;
            else
                cEnd = mid - 1;
        }
        return new int[]{-1,-1}; //if target not found
    }
    static int[] search(int[][] mat, int target) {
        int row = mat.length;
        int col = mat[0].length;
        //if matrix has only one row
        if (row == 1)
            return binarySearch(mat, 0, 0, col-1, target);
        int rStart = 0;
        int rEnd = row - 1;
        int cMid = col/2;

        //to run the loop till 2 rows are remaining
        while (rStart < (rEnd - 1)) {
            //while this is true it will have more than 2 rows
            int mid = rStart + (rEnd - rStart) / 2;
            if (mat[mid][cMid] == target)
                return new int[]{mid, cMid};
            if (mat[mid][cMid] < target)
                rStart = mid;
            else
                rEnd = mid;
        }
        //now we have 2 rows
        //to check if the column is in the columns of the above 2 rows
        if(mat[rStart][cMid] == target)
            return new int[]{rStart,cMid};
        if(mat[rStart + 1][cMid] == target)
            return new int[]{rStart + 1,cMid};
        //search in first half
        if(target <= mat[rStart][cMid - 1])
            return binarySearch(mat, rStart, 0, cMid - 1, target);
        //search in second half
        if(target >= mat[rStart][cMid + 1] && target <= mat[rStart][col - 1])
            return binarySearch(mat, rStart, cMid + 1, col - 1, target);
        //search in third half
        if(target <= mat[rStart + 1][cMid - 1])
            return binarySearch(mat, rStart + 1, 0, cMid - 1, target);
        //search in fourth half
        else
            return binarySearch(mat, rStart +1, cMid + 1, col - 1, target);
    }
}

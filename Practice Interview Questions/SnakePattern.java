//https://www.geeksforgeeks.org/problems/print-matrix-in-snake-pattern-1587115621/1

import java.util.*;

public class SnakePattern {
    static ArrayList<Integer> matrixSnakePattern(int matrix[][]){

        ArrayList<Integer> ans = new ArrayList<>();
        int n = matrix.length;

        for(int i=0; i<n; i++){

            //even indexed rows - left to right
            if(i %2 == 0){
                for(int j=0; j<matrix[i].length; j++)
                    ans.add(matrix[i][j]);
            }

            //odd indexed rows - right to left
            else{
                for(int j = matrix[i].length - 1; j>=0; j--)
                    ans.add(matrix[i][j]);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] matrix = {{8,6,5},
                          {7,0,4},
                          {4,8,2},
                          {76,43,86}
                          };

        System.out.println("Snake Pattern: "+matrixSnakePattern(matrix));
    }
}



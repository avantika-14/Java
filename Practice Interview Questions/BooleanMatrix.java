// https://www.geeksforgeeks.org/problems/boolean-matrix-problem-1587115620/1

public class BooleanMatrix {

    public static void booleanMatrix(int matrix[][]) {

        int row = matrix.length;
        int col = matrix[0].length;

        boolean[] rows = new boolean[row];
        boolean[] cols = new boolean[col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                if (matrix[i][j] == 1) {
                    rows[i] = true;
                    cols[j] = true;
                }
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(rows[i] || cols[j])
                    matrix[i][j] = 1;
            }
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] mat = {
                {1, 0, 0},
                {0, 0, 0},
                {0, 0, 1}
        };

        System.out.println("Original Matrix:");
        printMatrix(mat);

        booleanMatrix(mat);

        System.out.println("Modified Matrix:");
        printMatrix(mat);
    }
}

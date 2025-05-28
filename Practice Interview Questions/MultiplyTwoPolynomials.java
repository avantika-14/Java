// https://www.geeksforgeeks.org/problems/multiply-two-polynomals0721/1

import java.util.Arrays;

public class MultiplyTwoPolynomials {

    public static int[] multiply(int[] polynomial1, int[] polynomial2) {
        int[] result = new int[polynomial1.length + polynomial2.length - 1];

        for (int i = 0; i < polynomial1.length; i++) {
            for (int j = 0; j < polynomial2.length; j++)
                result[i + j] = polynomial1[i] * polynomial2[j];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] polynomial1 = {1, 2, 3, 4, 5};
        int[] polynomial2 = {6, 7, 8, 9, 10};
        System.out.println("the multiplied answer is: "+ Arrays.toString(multiply(polynomial1, polynomial2)));
    }
}

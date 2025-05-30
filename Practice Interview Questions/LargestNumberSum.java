// https://www.geeksforgeeks.org/problems/largest-number-with-given-sum-1587115620/1

import java.util.Scanner;

public class LargestNumberSum {

    static String largestNumber(int n, int sum) {
        // add your code here
        if(n == 0)
            return "-1";

        if(sum == 0)
            return "0".repeat(n);
            // repeat 0 n times

        if(sum > n * 9)
            return "-1";

        StringBuilder result = new StringBuilder();

        for(int i = 0; i < n; i++) {
            if(sum >= 9){
                result.append('9');
                sum -= 9;
            }
            else{
                result.append((char)('0' + sum));
                sum = 0;
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of digits: ");
        int n = sc.nextInt();

        System.out.println("Enter the sum: ");
        int sum = sc.nextInt();

        System.out.println("the largest number with given sum is: " +largestNumber(n, sum));
    }
}

// https://www.geeksforgeeks.org/problems/replace-all-0-with-5-in-an-input-integer/1

import java.util.Scanner;

public class Replace0with5 {

    public static int convertFive (int n) {
        int ans = 0;
        int factor = 1;

        if (n == 0)
            return 5;

        while (n > 0){
            if (n % 10 == 0)
                ans += factor * 5;
            else
                ans += factor * (n % 10);

            n /= 10;
            factor *= 10;
        }

        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your desired number: ");
        int num = sc.nextInt();
        System.out.println("the new number with replaced digits is: " +convertFive(num));
    }
}

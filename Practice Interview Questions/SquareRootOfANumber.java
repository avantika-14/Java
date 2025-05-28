import java.util.Scanner;

public class SquareRootOfANumber {

    public static int floorSqrt(int x) {
         int start = 0;
         int end = x;
         int ans = 0;

         while (start <= end) {
             int mid = start + (end - start) / 2;

             if (mid * mid == x)
                 return mid;

             if (mid * mid < x) {
                 ans = mid;
                 start = mid + 1;
             }

             else
                 end = mid - 1;
         }

         return ans;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("The square root of " + n + " is " + floorSqrt(n));
    }
}

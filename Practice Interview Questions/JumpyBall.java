// https://www.geeksforgeeks.org/problems/jumpy-ball1449/1

import java.util.Scanner;

public class JumpyBall {

    public static long jumpyBall(long n) {

        long h = 0;

        while (n != 0) {
            h += (2 * n);
            n /= 2;
        }

        return h;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the height:");
        long n = sc.nextLong();

        System.out.println("the distance the ball covers in total is: " + jumpyBall(n));

    }
}

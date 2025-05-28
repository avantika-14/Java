import java.util.Scanner;

public class Palindrome {

    public static boolean isPalindrome(int n) {
        int number = n;
        int rev = 0;

        while(n > 0){
            rev = rev * 10 + n % 10;
            n /= 10;
        }

        if(rev == number)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        if(isPalindrome(n))
            System.out.println("Number is a Palindrome");
        else
            System.out.println("Number is not a Palindrome");
    }
}

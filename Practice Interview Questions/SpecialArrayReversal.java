// https://www.geeksforgeeks.org/problems/special-array-reversal2328/1

import java.util.Scanner;

public class SpecialArrayReversal {

    public static String reverse(String str) {
        // complete the function here

        char[] arr = str.toCharArray();

        int i = 0;
        int j = str.length() - 1;

        while (i < j){

            if(i < j && !(Character.isLetter(arr[i]))){
                i++;
            }

            else if(i < j && !(Character.isLetter(arr[j]))){
                j--;
            }

            else {
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        return new String(arr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string to reverse letters only:");
        String input = sc.nextLine();

        System.out.println("Output: " +reverse(input));

    }
}

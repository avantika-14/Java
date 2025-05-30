// https://www.geeksforgeeks.org/problems/print-bracket-number4058/1

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class PrintBracketNumber {
    public static ArrayList<Integer> bracketNumbers (String str){

        int count = 1;

        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> result = new ArrayList<>();

        for(int i = 0; i < str.length(); i++){

            char ch = str.charAt(i);

            if(ch == '('){
                stack.push(count);
                result.add(count);
                count++;
            }

            if(ch == ')'){
                if(!stack.isEmpty())
                    result.add(stack.pop());
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the expression: ");
        String input = sc.nextLine();

        System.out.println("Bracket Numbers:" + bracketNumbers(input));
    }
}

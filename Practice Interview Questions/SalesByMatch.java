//https://www.hackerrank.com/challenges/sock-merchant/problem

import java.util.*;

public class SalesByMatch {

    public static int sockMerchant(int n, List<Integer> socks) {
        // Write your code here

        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for(int color : socks)
            frequencyMap.put(color, frequencyMap.getOrDefault(color, 0) + 1);

        int pairs = 0;

        for(int count : frequencyMap.values())
            pairs += count / 2;

        return pairs;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of socks : ");
        int n = sc.nextInt();

        System.out.println("Enter the socks color one by one : ");
        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++)
            arr.add(sc.nextInt());

        System.out.println("The number of pairs available are: " + sockMerchant(n, arr));
    }
}

//https://www.geeksforgeeks.org/problems/counting-sort/1

public class CountingSort {
    public static String countSort(String arr) {
        int[] count = new int[26]; //to store the count of every alphabet

        for (int i = 0; i < arr.length(); i++) {
            int temp = arr.charAt(i) - 'a';
            count[temp]++;
        }

        StringBuilder sb = new StringBuilder();

        // here the position of non zero elements from count is fetched and converted to alphabets again
        // since count is parsed through from beginning the alphabets are automatically sorted
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                sb.append((char) (i + 'a'));
                count[i]--;
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String input = "geeksforgeeks";
        System.out.println("Sorted string: " + countSort(input));
    }
}

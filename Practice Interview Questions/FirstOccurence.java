//https://www.geeksforgeeks.org/problems/implement-strstr/1

public class FirstOccurence {
    static int firstOccurence(String txt, String pat) {
        // Your code here
        int index = -1;
        boolean found = false;

        for (int i = 0; i < txt.length(); i++) {

            if (txt.charAt(i) == pat.charAt(0)) {
                found = true;

                for(int j = i + 1; j < pat.length(); j++) {
                    if (txt.charAt(i + j) != pat.charAt(j)) {
                        found = false;
                        break;
                    }
                }

                if (found) {
                    index = i;
                    break;
                }
            }
        }
        return index;
    }

    public static void main(String[] args) {
        String s = "geeksforgeeks";
        String x = "geeksforgeeks";
        System.out.println("First occurrence index: " + firstOccurence(s, x));
    }
}

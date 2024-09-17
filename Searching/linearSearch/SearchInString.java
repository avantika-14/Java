package linearSearch;

public class SearchInString {
    public static void main(String[] args) {
        String name = "hi how are you";
        char target = 'h';
        System.out.println(searchInString(name, target));
    }
    static boolean searchInString(String s, char target) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == target) {
                return true;
            }
        }
        return false;
    }
}

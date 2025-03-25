//LeetCode: 2108
public class FindFirstPalindromicStringInTheArray {
    public static void main(String[] args) {
        String[] words = {"abc","car","ada","racecar","cool"};
        for (String word: words) {
            String reversed = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                reversed = reversed + word.charAt(i);
            }
            if (word.equals(reversed)) {
                System.out.println(reversed);
            }
        }
    }
}

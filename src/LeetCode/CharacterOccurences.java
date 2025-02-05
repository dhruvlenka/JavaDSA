//Leetcode: 1941
import java.util.HashMap;
public class CharacterOccurences {
    public static void main(String[] args) {
        String s = "abacbc";
        System.out.println(occurence(s));
    }
    public static boolean occurence(String s){
        int[] charCounts = new int[26];
        for (int i = 0; i < s.length(); i++) {
            charCounts[s.charAt(i) - 'a']++;
        }
        int count = charCounts[s.charAt(0) - 'a'];
        for (int i = 0; i < 26; i++) {
            if (charCounts[i] != 0 && charCounts[i] != count) {
                return false;
            }
        }
        return true;
    }
}

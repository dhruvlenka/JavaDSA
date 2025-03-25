//LeetCode: 2000
public class ReversePrefixOfWord {
    public static void main(String[] args) {
        String reversePre = reversePrefix("abcdefd",'d');
        System.out.println(reversePre);

    }
    public static String reversePrefix(String word, char ch){
        //indexOf: searches for the first occurence of a character or substring.
        int index = word.indexOf(ch); //ch: 'd', index = 3
        if (index == -1) {
            return word; // character not found in the word
        }
        String prefix = word.substring(0, index+1) ; // including the character
        String suffix = word.substring(index+1);
        StringBuilder sb = new StringBuilder(prefix);
        sb.reverse();
        return sb.toString() + suffix;
    }
}

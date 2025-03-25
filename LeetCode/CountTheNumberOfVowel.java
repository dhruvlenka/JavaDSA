//Leetcode: 2586
public class CountTheNumberOfVowel {
    public static void main(String[] args){
        String[] words = {"are","amy","u"};
        for(String s: words){
            System.out.println(s);
        }
    }
    public static int vowelString(String[] words, int left, int right){
        int count = 0;
        for (int i = left; i<= right; i++){
            if (isVowel(words[i])){
                count++;
            }
        }
        return count;
    }
    public static boolean isVowel(String word){
        char i = word.charAt(0);
        char j = word.charAt(word.length()-1);
        String vowel = "aeiou";
        return vowel.indexOf(i) != -1 && vowel.indexOf(j) != -1;
    }
}

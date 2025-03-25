//Leetcode: 2114
public class MaximumNoOfWordInSentence {
    public static void main(String[] args) {
        String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        int max = 0;
        for (String sentence : sentences) {
            int temp = findNum(sentence);
            max = Math.max(max, temp);
        }
        System.out.println(max);
    }

static int findNum(String str) {
    String[] words = str.split("\\s+");
    int numWords = words.length;

    return numWords;
     }
}
package String.Questions;

public class WordsCounter {
    public static void main(String[] args) {
        String str = "Chef loves programming and algorithms";
        String[] words = str.split(" ");
        int count = 0;
        for (String word: words){
            if (word.length() > 6){
                count++;
            }
        }
        System.out.println(count);
    }
}

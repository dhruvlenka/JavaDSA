package String.Questions;

//split method will use
public class LengthOfEachWord {
    public static void main (String[] args) {
        // your code goes here
        String str = "Coding in CodeChef";
        String[] words = str.split(" ");
        for(String word: words){
            System.out.println(word + " - " + word.length());
        }
        System.out.println(str + " - " + str.length());
    }
}

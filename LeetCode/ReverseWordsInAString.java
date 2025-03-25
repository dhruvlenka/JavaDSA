//LeetCode: 557

public class ReverseWordsInAString {
    public static void main(String[] args) {
        String s = "dhruv lenka";
        String reverse = reverseWord(s);
        System.out.println(reverse);
    }
    public static String reverseWord(String s){
        String[] words = s.split("\\s"); //s:"dhruv lenka", words: ["dhruv","lenka"]
        String reverseWord = "";
        for (String rev: words){ //words: ["dhruv", "lenka"] rev: "dhruv", rev: "lenka"
            StringBuilder sb = new StringBuilder(rev); //rev:"dhruv", rev: "lenka"
            sb.reverse(); //sb: "dhruv", sb: "lenka"
            reverseWord = reverseWord + sb.toString() + " "; //reverseWord: "", sb: "vurhd", sb: "aknel"
        }
        return reverseWord.trim();
    }
}
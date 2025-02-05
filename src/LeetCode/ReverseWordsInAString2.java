public class ReverseWordsInAString2 {
    public static void main(String[] args) {
        String s = "620000 3792";
        String rev = reverseWords(s);
        System.out.println(rev);
    }
    //method for reverse the words of the string
    public static String reverseWords(String s){
        //String s = "dhruv lenka"
        String[] words = s.split(" "); // "dhruv", "lenka"
        String revWords = "";
        for (String reverse: words){ //reverse: "dhruv", "lenka"
            StringBuilder stB = new StringBuilder(reverse);
            stB.reverse(); //stB: "teneT", "rehpyC"
            //concateing the string for printing reverse string in one line
            revWords = revWords + stB.toString() + " ";
        }
        return revWords.trim();
    }
}

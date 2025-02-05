package TwoPointers;

public class FindFirstPalindromicStringInTheArray {
    public static void main(String[] args) {
                          //0   //1   //2     //3      //4
        String[] words = {"abc","car","ada","racecar","cool"};
        for (int i=0; i<words.length; i++){
            if (Palindrome(words[i],0, words.length-1)){
                System.out.println(words[i]);
            }
        }
        System.out.println("");
    }
    public static boolean Palindrome(String words, int start, int end){
        start = 0;
        end = words.length()-1;
        while (start < end){
            if (words.charAt(start) != words.charAt(end)){
                return false;
            }
            start++;
            end--; 
        }
        return true;
    }
}

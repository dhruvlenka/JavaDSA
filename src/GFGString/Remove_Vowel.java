package GFGString;

public class Remove_Vowel {
    public static void main(String[] args) {
        String s = "dhruv lenka";
        String ans = removeVowel(s);
        System.out.println(ans);
    }
    public static String removeVowel(String str){
        StringBuilder builder = new StringBuilder();

        for(char ch: str.toCharArray()){
            if(!isVowel(ch)){
                builder.append(ch);
            }
        }
        return builder.toString();
    }
    public static boolean isVowel(char ch){
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        for(char vowel: vowels){
            if(ch == vowel){
                return true;
            }
        }
        return false;
    }
}

package GFGString;

public class RemoveVowel {
    public static void main(String[] args) {
        String s = "welcome to geeksforgeeks";
        remove_Vowel(s);
        String output = removeVowel(s);
        System.out.println(output);
    }

    public static String removeVowel(String s){
        String vowel = "aeiouAEIOU";
        StringBuilder sb = new StringBuilder();

        for(char c: s.toCharArray()){
            if(vowel.indexOf(c) == -1){
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void remove_Vowel(String s){
        String vowels = "aeiouAEIOU";
        String output = "";
        for(char c: s.toCharArray()){
            if(vowels.indexOf(c) == -1){
                output  = output + c;
            }
        }
        System.out.println(output);
    }
}

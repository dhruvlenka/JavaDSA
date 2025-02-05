package CodingNinjas;

public class PalindromeString {
    public static void main(String[] args) {
        String s = "N2 i&nJA?a& jnI2n";
        String replace = s.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(isPalindrome(replace));
    }

    static boolean isPalindrome(String word){
        String reverse = "";
        int length = word.length();
        for(int i=length-1; i>=0; i--)
            reverse = reverse + word.charAt(i);
        return word.equalsIgnoreCase(reverse);
    }
}

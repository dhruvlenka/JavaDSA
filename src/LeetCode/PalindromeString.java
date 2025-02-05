public class PalindromeString {
    public static void main(String[] args) {
        String words = "TENET";
        String reversed = "";
        for (int i=words.length()-1; i>=0; i--){
            reversed = reversed + words.charAt(i);
        }
        if (words.equals(reversed)){
            System.out.println("Palindrome");
        } else {
            System.out.println("Sorry it's not palindrome");
        }
    }
}

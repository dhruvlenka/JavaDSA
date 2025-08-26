package CoreJava.Loops.JumpStatementQuestions;

public class CountTheVowels {
    public static void main(String[] args) {
        String str = "Aakashi";
        int count = 0;
        for (int i=0; i<=str.length()-1; i++){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'A' ||
               str.charAt(i) == 'e' || str.charAt(i) == 'E' ||
               str.charAt(i) == 'i' || str.charAt(i) == 'I' ||
               str.charAt(i) == 'o' || str.charAt(i) == 'O' ||
               str.charAt(i) == 'u' || str.charAt(i) == 'U') {
                count++;
            }
        }
        System.out.println(count);
    }
}

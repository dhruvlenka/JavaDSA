package InterviewQuestions.RemoveDuplicates;

public class RemoveConsecutiveDuplicates {
    public static void main(String[] args) {
        String s = "aabccba";
        System.out.println(removeConsecutiveDuplicates(s));

    }
    public static String removeConsecutiveDuplicates(String s) {
        // Write your code here
        StringBuilder sb = new StringBuilder();
        char[] ch = s.toCharArray();

        for(int i=0; i<s.length(); i++){
            if(sb.length() == 0 || sb.charAt(sb.length()-1 ) != ch[i]){
                sb.append(ch[i]);
            }
        }
        return sb.toString();
    }
}

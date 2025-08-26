package String.Questions;

public class ReverseString {
    public static void main(String[] args) {
        String s = "Java is fun";
        String[] words = s.split(" ");

        StringBuilder sb = new StringBuilder();
        for(int i= words.length-1; i>=0; i--){
            sb.append(words[i]);
            if (i != 0) {
                sb.append(" ");
            }
        }
        System.out.println(sb);
    }
}

package StringBuilder;

public class ReverseString {
    public static void main(String[] args) {
        String b = "Bruce";
        StringBuilder sb = new StringBuilder(b);
        for(int i=0; i<sb.length()/2; i++){
            int front = i;
            int back = sb.length() - 1 - i; //5-1-0 => 4

            char frontChar = sb.charAt(front);
            char backchar = sb.charAt(back);

            sb.setCharAt(front, backchar);
            sb.setCharAt(back, frontChar);

            System.out.println(sb);

        }
    }
}

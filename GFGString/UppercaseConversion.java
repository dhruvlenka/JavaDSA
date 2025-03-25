package GFGString;

public class UppercaseConversion {
    public static void main(String[] args) {
        String s = "i love programming";
        String ans = uppercaseConversion(s);
        System.out.println(ans);
    }
    public static String uppercaseConversion(String s){
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(i == 0 || s.charAt(i-1) == ' '){
                sb.append(Character.toUpperCase(c));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}

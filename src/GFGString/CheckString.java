package GFGString;

public class CheckString {
    public static void main(String[] args) {
        String s = "qq";
        boolean ans = checkString(s);
        System.out.println(ans);

    }
    public static boolean checkString(String s){
        char c = s.charAt(0);
        for(int i=1; i<s.length(); i++){
            char currentChar = s.charAt(i);
            if(c != currentChar){
                return false;
            }
        }
        return true;
    }
}

import java.util.HashMap;

public class IsomorphicString {
    public static void main(String[] args) {
        String s = "paper";
        String t = "title";
        System.out.println(isomorphic(s,t));
    }
    public static boolean isomorphic(String s, String t){
        if (s.length() != t.length()){
            return false;
        }
        HashMap<Character, Character> sToT = new HashMap<>();
        HashMap<Character, Character> tToS = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            if (sToT.containsKey(ch1) && sToT.get(ch1) != ch2) {
                return false;
            }

            if (tToS.containsKey(ch2) && tToS.get(ch2) != ch1) {
                return false;
            }

            sToT.put(ch1, ch2);
            tToS.put(ch2, ch1);
        }

        return true;
    }
}

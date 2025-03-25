package StringBuilder;

import java.util.ArrayList;

public class ExtractInteger {
    public static void main(String[] args) {
        String s = "123dhruv1004lenka";
        System.out.println(extractInteger(s));
    }
    public static ArrayList<String> extractInteger(String s){
        ArrayList<String> al = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                sb.append(c);
            } else if(sb.length() > 0){
                al.add(sb.toString());
                sb.setLength(0); // Clear the StringBuilder for the next number
            }
        }
        // Print any remaining numbers in the StringBuilder if there are any
        if (sb.length() > 0) {
            al.add(sb.toString());
        }

        return al;
    }
}

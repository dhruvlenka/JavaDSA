package GFGString;

public class RemoveSpaces {
    public static void main(String[] args) {
        String s = "geeks for geeks";

        //removing Spaces using method
        String removedSpaces = s.replaceAll(" ", "");
        System.out.println(removedSpaces);


        //removing spaces using String Builder
        String ans = removeSpaces(s);
        System.out.println(ans);

    }
    public static String removeSpaces(String s){
        StringBuilder ans = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c != ' '){
                ans.append(c);
            }
        }
        return ans.toString();
    }
}

package GFGString;

public class CheckForBinary {
    public static void main(String[] args) {
        String str = "312";
        boolean ans = checkingBinary(str);
        System.out.println(ans);

    }
    public static boolean checkingBinary(String str){
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            if(c != '0' && c != '1'){
                return false;
            }
        }
        return true;
    }
}

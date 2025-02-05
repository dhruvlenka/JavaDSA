package GFGString;

public class CamelCase {
    public static void main(String[] args) {
        String s = "vikDHRUV";

        int ans = camelCase(s);
        System.out.println(ans);

        int ans2 = camel_Case(s);
        System.out.println(ans2);

    }
    public static int camelCase(String s){
        int count = 0;
        char[] c  = s.toCharArray();
        for(int i=0; i<s.length(); i++){
            if(c[i] >= 'A' && c[i] <= 'Z'){
                count++;
            }
        }
        return count;
    }
    public static int camel_Case(String s){
        int count = 0;

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c >= 'A' && c <= 'Z'){
                count++;
            }
        }
        return count;
    }
}

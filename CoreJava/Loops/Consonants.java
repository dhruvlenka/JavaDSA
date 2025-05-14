package CoreJava.Loops;

public class Consonants {
    public static void main(String[] args) {
        String str = "abcdefghijklmnopqrstuvwxyz";
        System.out.println(consonentsCounter(str));
        System.out.println(consonentsCounter2(str));
        System.out.println(consonentsCounter3(str));
    }
    public static int consonentsCounter(String str){
        int count = 0;
        for(int i=0; i<str.length(); i++){
            if(!(str.charAt(i) == 'a' || str.charAt(i) == 'A' || str.charAt(i) == 'e' || str.charAt(i) == 'E'
                    || str.charAt(i) == 'i' || str.charAt(i) == 'I' || str.charAt(i) == 'o' || str.charAt(i) == 'O'
                    ||  str.charAt(i) == 'u' || str.charAt(i) == 'U')) {
                count++;
            }
        }
        return count++;
    }
    public static int consonentsCounter2(String str){
        int count = 0;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(!(ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E'
                    || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O'
                    ||  ch == 'u' || ch == 'U')) {
                count++;
            }
        }
        return count++;
    }
    public static int consonentsCounter3(String str){
        int count = 0;
        int i=0;
        while(i<str.length()){
            char ch = str.charAt(i);
            if(!(ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E'
                    || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O'
                    ||  ch == 'u' || ch == 'U')) {
                count++;
            }
            i++;
        }
        return count++;
    }
}

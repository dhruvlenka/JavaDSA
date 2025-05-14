package CoreJava.Loops;

public class Vowels {
    public static void main(String[] args) {
        String str = "jatinaeioucjsdbfgjsgb";

        System.out.println(vowels_Counter(str));
        System.out.println(vowels_Counter(str));
        System.out.println(vowels_Counter2(str));
        System.out.println(vowels_Counter3(str));
    }
    public static int vowels_Counter(String str){
        int count = 0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'A' || str.charAt(i) == 'e' || str.charAt(i) == 'E'
                    || str.charAt(i) == 'i' || str.charAt(i) == 'I' || str.charAt(i) == 'o' || str.charAt(i) == 'O'
                    ||  str.charAt(i) == 'u' || str.charAt(i) == 'U') {
                count++;
            }
        }
        return count++;
    }
    public static int vowels_Counter2(String str){
        int count = 0;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E'
                    || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O'
                    ||  ch == 'u' || ch == 'U') {
                count++;
            }
        }
        return count++;
    }
    public static int vowels_Counter3(String str){
        int count = 0;
        int i=0;
        while(i<str.length()){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'A' || str.charAt(i) == 'e' || str.charAt(i) == 'E'
                    || str.charAt(i) == 'i' || str.charAt(i) == 'I' || str.charAt(i) == 'o' || str.charAt(i) == 'O'
                    ||  str.charAt(i) == 'u' || str.charAt(i) == 'U') {
                count++;
            }
            i++;
        }
        return count++;
    }
}

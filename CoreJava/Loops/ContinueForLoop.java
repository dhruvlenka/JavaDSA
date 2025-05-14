package CoreJava.Loops;

public class ContinueForLoop {
    public static void main(String[] args) {
        for(int i=2; i<=100; i++){
            if(i%2 == 1){
                System.out.println("i: "+i);
                continue;
            }
        }
        System.out.println("We got the Even Numbers");
    }

    public static class Vowels {
        public static void main(String[] args) {
            String str = "adhruveiou";
            System.out.println(vowels_Counter2(str));
        }
        public static int vowels_Counter(String str){
            int vowelsCount = 0;
            for(int i=0; i<str.length(); i++){
                if(str.charAt(i) == 'a' || str.charAt(i) == 'A' || str.charAt(i) == 'e' || str.charAt(i) == 'E'
                        || str.charAt(i) == 'i' || str.charAt(i) == 'I' || str.charAt(i) == 'o' || str.charAt(i) == 'O'
                        ||  str.charAt(i) == 'u' || str.charAt(i) == 'U') {
                    vowelsCount++;
                }
            }
            return vowelsCount;
        }
        public static int vowels_Counter2(String str){
            int vowelsCount = 0;
            for(int i=0; i<str.length(); i++){
                char ch = str.charAt(i);
                if(ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E'
                        || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O'
                        ||  ch == 'u' || ch == 'U'){
                    vowelsCount++;
                }
            }
            return vowelsCount;
        }
        public static int vowels_Counter3(String str){
            int count = 0;
            int i=0;
            while (i<str.length()){
                if(str.charAt(i) == 'a' || str.charAt(i) == 'A' || str.charAt(i) == 'e' || str.charAt(i) == 'E'
                        || str.charAt(i) == 'i' || str.charAt(i) == 'I' || str.charAt(i) == 'o' ||
                        str.charAt(i) == 'O'  ||  str.charAt(i) == 'u' || str.charAt(i) == 'U') {
                    count++;
                }
                i++;
            }
            return count;
        }
    //    public static char vowelsInAString(String str){
    //
    //    }
    }
}

//LeetCode: 2278
public class PercentageOfLetterInString {
    public static void main(String[] args) {
        String s = "foobar";
        char letter = 'o';
        double percentage;
        int count = 0;

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c == letter){
                count++;
            }
        }
        System.out.println(count);
        percentage = (double)count / s.length() * 100;
        System.out.println(percentage);

        //converting double to integer
        int convert = (int)percentage;

        System.out.println(convert);

        //direct multiplying and divide
        System.out.println((count * 100) / s.length());
    }
}

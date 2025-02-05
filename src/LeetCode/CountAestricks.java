//LeetCode: 2315
public class CountAestricks {
    public static void main(String[] args) {
        String s = "l|*e*et|c**o|*de|";
        int verticalBars = 0;
        int asterisks = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '|') {
                verticalBars++;
            }
            //vertical bars should be in pair
            if (verticalBars % 2 == 0 && s.charAt(i) == '*') {
                asterisks ++;
            }
        }
        System.out.println(asterisks);
    }
}

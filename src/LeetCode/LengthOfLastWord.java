public class LengthOfLastWord {
    public static void main(String[] args) {
        String line = "I Love You";
        int count = 0; //counting last word length
        line = line.trim(); //removing spaces from start and ends of the string

        int start = line.length()-1;
        System.out.println(start);

        for (int i = start; i>=0; i--){
            //We will iterate until we find spaces
            if (line.charAt(i) == ' '){
                break;
            }
            count++;
        }
        System.out.println(count);
    }
}

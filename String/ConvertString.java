package String;

public class ConvertString {
    public static void main(String[] args) {
        String str = "dhruv lenka";
        System.out.println(convertString(str));

    }

    public static String convertString(String str) {
        StringBuilder sb = new StringBuilder();
        String[] words = str.split(" ");
        for(String word: words){
            if(!word.isEmpty()){
                char firstCapital = Character.toUpperCase(word.charAt(0));
                sb.append(firstCapital);
                sb.append(word.substring(1));
                sb.append(" ");

            }
        }
        return sb.toString().trim();
    }
}

import java.util.Arrays;

public class SortingTheSentence {
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        String[] words = s.split(" ");
        Arrays.sort(words, (a,b) -> {
            int n1 = Integer.parseInt(a.replaceAll("\\D+", ""));
            int n2 = Integer.parseInt(b.replaceAll("\\D", ""));
            return n1-n2;
        });
        String shuffle = String.join(" ", words);
        String rep = shuffle.replaceAll("[0-9]","");
        System.out.println(rep);

        //method 2
        String[] answer = new String[s.split(" ").length];
        for(String st: s.split(" "))
        {
            answer[st.charAt(st.length()-1) - '1'] = st.substring(0,st.length()-1);
        }
        System.out.println(String.join(" ",answer));
    }
}

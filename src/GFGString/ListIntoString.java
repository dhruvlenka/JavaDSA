package GFGString;

public class ListIntoString {
    public static void main(String[] args) {
        char[] ch = {'g', 'e', 'e', 'k', 's', 'f', 'o', 'r', 'g', 'e', 'e', 'k', 's'};
        int n = 13;
        String ans = chartostr(ch, n);
        System.out.println(ans);

    }
    public static String chartostr(char[] arr, int N){
        StringBuilder sb = new StringBuilder();
        for(char i=0; i<N; i++){
            sb.append(arr[i]);
        }
        return sb.toString();
    }
}

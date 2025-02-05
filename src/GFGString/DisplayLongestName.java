package GFGString;

public class DisplayLongestName {
    public static void main(String[] args) {
        String[] names = {"Geek", "Geeks", "Geeksfor",
                "GeeksforGeek", "GeeksforGeeks"};
        int n = 5;
        String result = longest(names, n);
        System.out.println(result);

    }
    public static String longest(String names[], int n) {
        String longest = names[0];
        for(int i=0; i<n; i++){
            if(names[i].length() > longest.length()){
                longest = names[i];
            }
        }
        return longest;
    }
}

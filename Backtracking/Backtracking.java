package Backtracking;

public class Backtracking {
    public static void printPermutation(String str, String perm, int index){
        //base case: did we check the all characters and we have nothing to check
        if(str.length() == 0){
            System.out.println(perm);
            return;
        }
        for(int i=0; i<str.length(); i++){
            //storing the current char like: A
            char currChar = str.charAt(i);
            //removing the first character from the string
            String newStr = str.substring(0, i) + str.substring(i + 1);
            /*
            recursion: to get the all possible values
            perm + currChar = storing current char in the permutation
             */
            printPermutation(newStr, perm + currChar, index+1);
        }
    }
    public static void main(String[] args) {
        String str = "ABC";
        String perm = "";
        int index = 0;
        printPermutation(str, perm, index);

    }
}

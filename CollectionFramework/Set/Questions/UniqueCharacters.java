package CollectionFramework.Set.Questions;

import java.util.HashSet;

//Q. WWrite a java program to return true or false, if the string having unique characters using hash table.
public class UniqueCharacters {
    public static void main(String[] args) {
        String[] str = {"abcdef", "abcabc", "", "a", "1234567890"};

        for(String s: str){
            System.out.println("String \"" + s + "\" has unique characters: " + uniqueCharacters(s));
        }
    }

    public static boolean uniqueCharacters(String str){
        HashSet<Character> set = new HashSet<>();

        //iterating on each character using string
        for(char c: str.toCharArray()){
            //if character already exists: returning false
            if(!set.add(c)){
                return false;
            }
        }
        return true;
    }
}

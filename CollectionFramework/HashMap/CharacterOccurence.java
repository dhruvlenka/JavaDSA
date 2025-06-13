package CollectionFramework.HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//Find out the occurence of each character present in character type of array list.
public class CharacterOccurence {
    public static void main(String[] args) {
        ArrayList<Character> list = new ArrayList<>();
        list.add('a');
        list.add('b');
        list.add('c');
        list.add('d');
        list.add('e');
        list.add('a');
        list.add('b');
        list.add('c');
        list.add('d');
        list.add('e');
        list.add('e');

        //using HashMap to store frequency of each character
        HashMap<Character, Integer> hash = new HashMap<>();
        for(Character c : list){
            hash.put(c, hash.getOrDefault(c,0)+1);
        }

        //displaying the result
        for(Map.Entry<Character, Integer> entry: hash.entrySet()){
            System.out.println("Character: " + entry.getKey() + " Frequency: " + entry.getValue() + "");
        }
    }
}

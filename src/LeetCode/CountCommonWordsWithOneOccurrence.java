import java.util.HashMap;

//LeetCode: 2085
public class CountCommonWordsWithOneOccurrence {
    public static void main(String[] args) {
        String[] words1 = {"leetcode","is","amazing","as","is"};
        String[] words2 = {"amazing","leetcode","is"};

        int count = 0;
        HashMap<String, Integer> hash = new HashMap<>();
        HashMap<String, Integer> hash2 = new HashMap<>();

        for(String word : words1)
            hash.put(word,hash.getOrDefault(word,0)+1);
        for(String word : words2)
            hash2.put(word,hash2.getOrDefault(word,0)+1);

        for(String word : words1)
            if(hash.get(word) == 1 && hash2.getOrDefault(word,0) == 1)
                count++;
        System.out.println(count);
    }
}

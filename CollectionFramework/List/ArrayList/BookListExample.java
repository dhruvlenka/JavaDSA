package CollectionFramework.List.ArrayList;


import java.util.ArrayList;

public class BookListExample {
    public static void main(String[] args) {
        String[] str1 = {"abc", "def"};
        String[] str2 = {"egh", "ijk"};
        ArrayList<String> result = merge(str1, str2);
        System.out.println(result);
        for(String str: result){
            System.out.println(str);
        }
    }

    public static ArrayList<String> merge(String[] words, String[] more){
        ArrayList<String> sentence = new ArrayList<String>();
        for(String w: words){
            sentence.add(w);
        }
        for(String m: more){
            sentence.add(m);
        }
        return sentence;
    }
}

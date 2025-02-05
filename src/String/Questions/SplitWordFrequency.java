package String.Questions;

import java.util.HashMap;
import java.util.*;

public class SplitWordFrequency {
    public static void main(String[] args) {
        String s = "mohan and rohan and sohan and sohan and again mohan";
        getWordFrequency(s);
    }
    public static void getWordFrequency(String s){
        String[] p = s.split("\s+");
        Map<String, Integer> mapp = new HashMap<>();
        for(String k: p){
            if(mapp.containsKey(k)){
                mapp.put(k,mapp.get(k)+1);
                mapp.remove(k);
            } else {
                mapp.put(k,1);
            }
        }
        System.out.println(mapp);
    }
}

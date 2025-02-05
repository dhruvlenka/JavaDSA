package CollectionFramework;

import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class Frequency {
    public static void main(String[] args) {
        int[] arr = {12,18,12,30,30,12,70,12};
        getFrequency(arr);
        getFrequency3(arr);
//
//        String s = "abbcbffjf";
//        printFrequency(s);
//
//
    }

    public static void getFrequency(int[] arr){
        Map<Integer, Integer> map = new HashMap<>();
        for (int x : arr) {
           map.put(x, map.getOrDefault(x,0)+1);
        }
        System.out.println(map);
    }

    public static void getFrequency2(int[] arr){
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int x : arr) {
            if (!map.containsKey(x)) {
                map.put(x, 1);
            } else
                map.put(x,map.get(x)+1);
        }
        System.out.println(map);
    }

    public static void getFrequency3(int[] arr){
        Map<Integer, Integer> m1 = new HashMap<>();
        for(int x: arr){
            if(!m1.containsKey(x)){
                m1.put(x,1);
            } else {
                m1.put(x,m1.get(x) + 1);
            }
        }
        Set<Map.Entry<Integer,Integer>> ent = m1.entrySet();
        for(Map.Entry<Integer, Integer> p: ent){
            System.out.println(p.getKey() + " is: " + p.getValue());
        }
    }

    public static void printStringFrequency(String s){
        Map<Character, Integer> mapStr = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char p = s.charAt(i);
            mapStr.put(p, mapStr.getOrDefault(p,0)+1);
//            if(mapStr.containsKey(p)){
//               mapStr.put(p, mapStr.get(0)+1);
//            } else {
//                mapStr.put(p,1);
//            }
        }
        System.out.println(mapStr);
    }

    public static void printStringFrequency2(String s ){
        Map<Character, Integer> m1 = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char p = s.charAt(i);
            if(m1.containsKey(p)){
                m1.put(p,m1.get(p)+1);
            } else {
                m1.put(p,1);
            }
        }
        Set<Map.Entry<Character, Integer>> ent = m1.entrySet();
//        for(Map.Entry<Integer, Integer> p: ent){
//
//        }
    }

}

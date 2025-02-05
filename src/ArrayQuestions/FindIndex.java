package ArrayQuestions;

import java.util.ArrayList;


//Finding indeing using ArrayList
public class FindIndex {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,5};
        int n = 6;
        int key = 5;

        ArrayList<Integer> result = findIndex(array, n, key);
        System.out.println(result);

    }
    public static ArrayList<Integer> findIndex(int[] a, int N, int key) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i<N; i++){
            if(a[i] == key){
                list.add(i);
                list.add(-1);
            }
        }
        return list;
    }
}

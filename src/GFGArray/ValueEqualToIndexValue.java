package GFGArray;

import java.util.ArrayList;
public class ValueEqualToIndexValue {


    public static void main(String[] args) {
        int[] arr = {15, 2, 45, 12, 7};
        int n = 5;
        System.out.println(valueEqualToIndex(arr, n));
    }

 public static ArrayList<Integer> valueEqualToIndex(int[] arr, int n) {
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0; i<n; i++){
            int value = arr[i]; //storing current value
            int reqIndex = i+1; //because it's 1-based indexing
            if(arr[i] == reqIndex){
                ans.add(reqIndex);
            }
        }
        return ans;
    }
}

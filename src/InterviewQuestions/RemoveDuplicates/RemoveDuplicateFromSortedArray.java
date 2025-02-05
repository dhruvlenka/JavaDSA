package InterviewQuestions.RemoveDuplicates;

import java.util.HashSet;

public class RemoveDuplicateFromSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3,3,4,4,5,5};
        int n = arr.length;
        System.out.println(removeDuplicates(arr, n));
        System.out.println(removeDuplicates2(arr));
        System.out.println(removeDuplicates3(arr, n));

    }

    public static int removeDuplicates(int[] arr, int n) {
        // Write your code here.
        int i = 0;
        for(int j = 0; j<n; j++){
            if(arr[j] != arr[i]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i+1;
    }

    public static int removeDuplicates2(int[] arr) {
        HashSet<Integer> set = new HashSet<>();

        for (Integer num : arr) {
            // list.add(num);
            set.add(num);
        }
        return set.size();
    }

    public static int removeDuplicates3(int[] arr, int n){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<n; i++){
            if(!set.contains(arr[i])){
                set.add(arr[i]);
            }
        }
        return set.size();
    }
}

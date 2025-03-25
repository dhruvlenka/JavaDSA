import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class ContainDuplicates {
    public static void main(String[] args) {
        // Best case complexities
        int[] nums = {1,2,3,4,5,4};
        HashSet<Integer> set = new HashSet<>();
        for (int i=0; i<nums.length; i++){
            if(set.contains(nums[i])){
                System.out.println(true);
            }
            set.add(nums[i]);
        }
        System.out.println(false);
        /*
         for (int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] == nums[j]){
                    System.out.println(true);
                }
            }
        }
        System.out.println(false);
        /*
         int[] nums = {1,2,3,4,5,4};
        Arrays.sort(nums);
        for (int i=0; i<nums.length-1; i++){
            if (nums[i] == nums [i+1]) System.out.println(true);
        }
        System.out.println(false);
         */
    }
}

package Recursion;

import java.util.ArrayList;

public class Recursion_Subset {
    static ArrayList<ArrayList<Integer>> subsetsSolve(int[] nums, ArrayList<Integer> output, int index, ArrayList<ArrayList<Integer>> ans){
        //base case
        if(index >= nums.length){
            ans.add(output);
            return ans;
        }
        //exclude
        subsetsSolve(nums, output, index+1, ans);

        //include
        output.add(nums[index]);
        subsetsSolve(nums, output, index+1, ans);

        //backtracking
        output.remove(output.size() -1);
        return ans;

    }

    public static ArrayList<ArrayList<Integer>> Subsets(int[] nums) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> output = new ArrayList<>();
        int index = 0;
        subsetsSolve(nums, output, index, ans);
        return ans;

    }

    public static void main(String[] args) {
        int[] input = {1,2,3};
    }
}

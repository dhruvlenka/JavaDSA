package Recursion;

import java.util.ArrayList;

//Permutation of String
public class Recursion_Permutation {

    public static void swap(ArrayList<Integer> list, int index, int j){
       Integer temp = list.get(index);
       list.set(index, list.get(j));
       list.set(j, temp);
    }

    public static void solve(ArrayList<Integer> nums, ArrayList<ArrayList<Integer>> ans, int index){
        if(index >= nums.size()){
            ans.add(new ArrayList<>(nums));
            return;
        }
        for(int j=index; j<nums.size(); j++){
            swap(nums, index, j);
            solve(nums, ans, index+1);
            //backtracking
            swap(nums, index, j);
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        System.out.println(permute(nums));

    }
    public static ArrayList<ArrayList<Integer>>  permute (ArrayList<Integer> nums) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> numsList = new ArrayList<>();
        for(int num: nums){
            numsList.add(num);
        }
        //int index = 0;
        solve(numsList, ans, 0);
        return ans;
    }
}

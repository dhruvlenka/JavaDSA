package TwoPointers;

//Leetcode: 167
public class TwoSum2 {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int[] ans = twoSum(nums,9);
        for (int sum: ans){
            System.out.print(sum + " ");
        }
    }
    public static int[] twoSum(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;

        while (start < end){
            int sum = nums[start] + nums[end];
            if (sum == target){
                //if matching pair is found their return their indices
           return new int[] {start + 1, end + 1};
            } else if (sum < target){
                //if sum is small then start will move pointer to forward direction
                start++;
            } else {
                //if sum is large then end will move pointer to backward direction
                end--;
            }
        }
        //if no matching pair is found
        return new int[0];
    }
}

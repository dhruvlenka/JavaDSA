package ArrayQuestions;

//Leetcode: 189
public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int target = 3;

        target = target % nums.length;
        reverse(nums, 0 , nums.length-1);
        reverse(nums, 0, target-1);
        reverse(nums, target, nums.length-1);

        for(int n: nums){
            System.out.print(n + " ");
        }
    }
    public static void reverse(int[] nums, int start, int end){
        while (start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}

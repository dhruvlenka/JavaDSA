//LeetCode: 922
public class SortArrayByParity2 {
    public static void main(String[] args) {
        int[] nums = {3,4};
        int start = 0;
        int end = nums.length-1;

        for(int i=0; i<nums.length; i++){
            if(nums[start] % 2 != 0){
                reverse(nums,start,end);
            }
        }

        for (int i=0; i<nums.length; i++){
            if (nums[start] % 2 == 0){
                start++;
                if (nums[start] % 2 == 0){
                    reverse(nums,start,end);
                    start++;
                    if (nums[start] % 2 != 0){
                        reverse(nums, start, end);
                    }
                }
            }
        }
        for (int alternate: nums){
            System.out.println(alternate);
        }
    }
    public static void reverse(int[] nums, int start, int end){
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}

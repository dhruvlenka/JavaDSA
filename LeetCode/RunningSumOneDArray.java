public class RunningSumOneDArray {
    public static void main(String[] args) {
     int[] nums = {1,2,3,4}; //OUTPUT: 1,3,6,10
        for(int i=1;i<nums.length;i++){
            nums[i] = nums[i] + nums[i-1];
        }
        for(int i: nums){
            System.out.print(i+ " ");
        }
    }
}

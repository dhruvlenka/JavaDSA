//LeetCode: 724
public class FindPivotIndex {
    public static void main(String[] args) {
        int[] nums = {1,7,3,6,5,6};
        int pivot = pivotIndex(nums);
        System.out.println(pivot);

    }
    public static int pivotIndex(int[] nums){
        int leftIndexSum = 0;
        int totalIndexSum = 0;

        for(int num: nums){
            totalIndexSum = totalIndexSum + num;
        }
        for (int i=0; i<nums.length; i++){
            if (leftIndexSum == totalIndexSum - leftIndexSum - nums[i]){
                return i;
            }
            leftIndexSum = leftIndexSum + nums[i];
        }
        return -1;
    }
}

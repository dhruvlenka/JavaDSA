//Leetcode: 1512
public class NumberOfGoodPairs {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1};
        int count = 0;
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<i; j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}

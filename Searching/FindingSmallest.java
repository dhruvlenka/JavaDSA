package Searching;

public class FindingSmallest {
    public static void main(String[] args) {
        int[] nums = {3,4,1,7,9,2};
        int smallest = nums[0];
        for(int i=0; i<nums.length; i++){
            if (nums[i] < smallest){
                smallest = nums[i];
            }
        }
        System.out.println(smallest);
    }
}

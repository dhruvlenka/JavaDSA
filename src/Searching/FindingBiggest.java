package Searching;

public class FindingBiggest {
    public static void main(String[] args) {
        int[] nums = {3,4,1,7,9,2};
        int biggest = nums[0];
        for(int i=0; i<nums.length; i++){
            if (nums[i] > biggest){
                biggest = nums[i];
            }
        }
        System.out.println(biggest + "is the biggest element in the array.");
    }
}

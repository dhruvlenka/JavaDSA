package ArrayQuestions;

//Leetcode: 283
public class MoveZeroes {
    public static void main(String[] args) {
        int[] arr = {12,18,0,1,0,1,1,2,0};


    }
    public static void moreZeroes(int[] nums){
        int zero = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=0){
                int temp = nums[zero];
                nums[zero] = nums[i];
                nums[i] = temp;
                zero++;
            }
        }
    }
}

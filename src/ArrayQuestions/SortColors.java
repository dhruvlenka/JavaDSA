package ArrayQuestions;

//Leetcode:75
public class SortColors {
    public static void main(String[] args) {
        int[] arr = {0,2,0,1,2,1,0,2};
        sortColors(arr);

    }
    public static void sortColors(int[] nums){
        int count0 = 0;
        int count1= 0;

        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0){
                count0 ++;
            } else if (nums[i] == 1) {
                count1++;
            }
        }
        for(int i=0; i<nums.length; i++){
            if(i<count0){
                nums[i] = 0;
            } else if (i<count0 + count1) {
                nums[i] = 1;
            } else {
                nums[i] = 2;
            }
        }
        for(int a:nums){
            System.out.print(a + " ");
        }
    }
}

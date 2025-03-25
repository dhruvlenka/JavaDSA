//LeetCode: 905
public class SortArrayByParity {
    public static void main(String[] args) {
        int[] nums = {3,1,2,4};
        //1st way to solve
//        int brownPointer = 0; // if odd then move forward
//        int greenPointer = 0; // if even then swap
//        while (greenPointer < nums.length){
//            if (nums[greenPointer] % 2 == 0){
//                reverse(nums, greenPointer,brownPointer);
//                greenPointer++;
//                brownPointer++;
//            } else {
//                // if odd then move forward
//                greenPointer++;
//            }
//        }
//       for (int i: nums){
//           System.out.println(i);
//       }
       //2nd way to solve

        int start = 0;
        int end = nums.length-1;
        for (int i=0; i<nums.length; i++){
          if (nums[start] % 2 == 0 && nums[end] % 2 != 0){
              reverse(nums, start, end);
          } if (nums[start] % 2 != 0){
              start++;
          } if (nums[end] %2 == 0){
              end--;
          }
        }
        for (int num : nums){
            System.out.println(num);
        }
    }
    //two pointers
    public static void reverse(int[] nums, int start, int end) {
            //swapping
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

    }
}

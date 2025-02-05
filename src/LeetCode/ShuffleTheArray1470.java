public class ShuffleTheArray1470 {
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        int target = 3;
        int[] nums2 = new int[target];
        int[] nums3 = new int[target];
        for(int i=0;i<nums2.length;i++){
            nums2[i] = nums[i];
        }
        //  System.out.println(Arrays.toString(nums2));

        for(int i=0;i<nums3.length;i++){
            nums3[i] = nums[i+target];
        }
        // System.out.println(Arrays.toString(nums3));

        for(int i=0; i<nums2.length;i++){
            System.out.print(nums2[i] + ",");
            System.out.print(nums3[i] + ",");
        }
    }
}

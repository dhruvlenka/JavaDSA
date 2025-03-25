import java.util.Arrays;

//LeetCode: 1470
public class ShuffleTheArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,4,3,2,1};
        int target = 4;
        int[] nums2 = new int[target]; //nums2: [0,0,0]
        int[] nums3 = new int[target]; //nums3: [0,0,0]

        // create an array to hold the shuffled values
        int[] result = new int[nums.length];

        // separate the input array into two halves
        for (int i = 0; i < target; i++) {
            nums2[i] = nums[i];
            nums3[i] = nums[i + target];
        }

        // shuffle the two halves and store the result in a new array
        for (int i = 0; i < target; i++) {
            result[2*i] = nums2[i];
            result[2*i+1] = nums3[i];
        }
        System.out.println(Arrays.toString(result));
    }
}

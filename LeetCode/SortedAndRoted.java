import java.util.Arrays;

public class SortedAndRoted {
    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 1, 2};
//        int[] sort = nums;
//        Arrays.sort(sort);
//        if (nums == sort){
//            System.out.println(true);
//        }
        int x = 0, n = nums.length;
        for (int i = 0; i < n; ++i) {
            if (nums[i] > nums[(i + 1) % n]) {
                x++;
            }
            if (x > 1) {
                System.out.println(false);
            }
        }
        System.out.println(true);
    }
}

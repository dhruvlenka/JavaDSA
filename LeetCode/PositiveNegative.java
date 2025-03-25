//LeetCode: 2529
public class PositiveNegative {
    public static void main(String[] args) {
        int[] nums = {-2, -1, -1, 1, 2, 3};
        int pos = 0;
        int neg = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                pos++;
            } else if (nums[i] < 0) {
                neg++;
            }
        }
        //using Math.max built in method
        int max = Math.max(pos, neg);
        System.out.println(max);

        //or we can write
        if (pos > neg){
            System.out.println(pos);
        }
        System.out.println(neg);
       }
    }

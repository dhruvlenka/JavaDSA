public class LongestContIncSeq {
    public static void main(String[] args) {
        int[] nums = {1,3,5,4,7}; //length = 5
        int count=0, max = 0;

        for(int i=1; i<nums.length; i++){
            if (nums[i-1] < nums[i]){
                count++;
                max = Math.max(count, max);
            }
            else {
                count = 0;
            }
        }
        System.out.println(max+1);
    }
}

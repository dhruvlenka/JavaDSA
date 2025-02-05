public class NonDecreasingOrder {
    public static void main(String[] args) {
        int[] nums = {5,2,3,4};
        int n = nums.length;
        int count = 0;
        for (int i = 0; i<n-1; i++){
              if (nums[i] > nums[i+1]){
                  count++;
                  if (count > 1){
                      System.out.println(false);
                  }
                  if (i>0 && nums[i+1] > nums[i+1]){
                      nums[i+1] = nums[i];
                  }
              }
        }
        System.out.println(true);
    }
}

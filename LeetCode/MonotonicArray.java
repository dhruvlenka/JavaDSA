public class MonotonicArray {
    public static void main(String[] args) {
        int[] nums = {1,3,2};
        int n = nums.length;
        boolean Inc = false;
        if(nums[0]<nums[n-1])
            Inc = true;
        for(int  i=1;i<n;i++){
            if(Inc==true){
                if(nums[i-1]>nums[i])
                    System.out.println(false);;
            }
            else
            if(nums[i]>nums[i-1])
                System.out.println(false);;
        }
        System.out.println(true);
    }
}

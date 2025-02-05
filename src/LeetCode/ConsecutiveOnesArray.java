public class ConsecutiveOnesArray {
    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1};
        int count = 0, max = 0;

        for(int i=0; i<nums.length; i++){
            if(nums[i]==1){
                count++;
            }else{
                if(max<count){
                    max = count;
                }
                count = 0;
            }
        }
        if(max>count){
            System.out.println(max);
        } else {
            System.out.println(count);
        }
        /*
        int count = 0; //will increase when elements will repeat
        int max = 0;

        for(int i=0; i<nums.length; i++){
            if (nums[i]==1){
                count++;
            } else {
                max = Math.max(count, max);
                   count = 0;
            }
        }
        System.out.println(Math.max(count, max));
        */
    }
}

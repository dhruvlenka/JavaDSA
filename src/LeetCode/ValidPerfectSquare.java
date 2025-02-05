//LeetCode: 367
public class ValidPerfectSquare {
    public static void main(String[] args) {
        int num = 16;
        if (num < 0){
            System.out.println(false);
        }
//        int i = 1;
//        /*
//        starts with 1 and add odds numbers
//        until the difference between the number and the sum
//        of squares becomes less than or equal to zero
//         */
//         while (num > 0){
//             num = num - i;
//             i = i + 2;
//        }
//        System.out.println(num == 0);

         //using Binary Search
        int left = 1, right = num;
        while (left <= right) {
            int mid = left + (right-left)/2;
            int square = mid*mid;
            if (square == num){
                System.out.println(true);
            }else if (square < num){
                left = mid+1;
            }else {
                right = mid-1;
            }
        }
        System.out.println(false);
    }
}

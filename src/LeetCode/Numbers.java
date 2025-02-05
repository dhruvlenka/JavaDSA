public class Numbers {
    public static void main(String[] args) {
        int nums = 14;
        int count = 0;
        while (nums > 0) {
            if (nums % 2 == 0) {
                nums = nums / 2;
                count++;
            } else {
                nums = nums - 1;
                count++;
            }
        }
        System.out.println(count);
    }
}
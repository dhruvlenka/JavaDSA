package Numbers;

public class PalindromeArray {
    public static void main(String[] args) {
        int[] arr = {111, 222, 333, 444, 20};
        int n = arr.length;
        int result = isPalindrome(arr, n);
        System.out.println(result);

    }

    //Palindrome Method
    public static int isPalindrome(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            int num = arr[i];
            int temp, rem, count = 0;
            temp = num;

            while (num > 0) {
                rem = num % 10;
                count = count * 10 + rem;
                num = num / 10;
            }
            if (temp == count) {
                return 1;
            }
        }
        return -1;
    }


    public static boolean isValidPalindrome(int num){
        int temp, rem, count = 0;
        temp = num;

        while (num > 0){
            rem = num % 10;
            count = count * 10 + rem;
            num = num / 10;
        }
        return temp == count;
    }
    //this methos is linked to isValidPalidrome it's checking the element is in the array is palindrome or not.
    public static int palinArray(int[] a, int n){
        for(int i=0; i<n; i++){
            if(!isValidPalindrome(a[i])){
                return 0;
            }
        }
        return 1;
    }
}

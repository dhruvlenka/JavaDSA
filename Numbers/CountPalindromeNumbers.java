package Numbers;

public class CountPalindromeNumbers {
    public static void main(String[] args) {
        int start = 1000;
        int end = 2000;

        int count = 0;
        for(int i=start; i<=end; i++){
            if(isPalindrome(i)){
                count++;
                System.out.println(i + " ");
            }
        }
        System.out.println(count);
    }
    //Palindrome Method
    public static boolean isPalindrome(int num){
        int temp, rem, count = 0;
        temp = num; //coping num values to temporary variable

        while (num > 0){
            rem = num % 10;
            count = count * 10 + rem;
            num = num / 10;
        }
        if (temp == count){
            return true;
        }
        else {
            return false;
        }
    }
}

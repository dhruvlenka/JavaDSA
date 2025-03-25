package Searching;

//69: sqrt() solving using binary search
public class SquareRoot {
    public static void main(String[] args) {
        int n = 1000000;
        int res = binarySearch(n);
        System.out.println(res);
    }
    public static int binarySearch(int n){
        int start = 0;
        int end = n;
        int mid = start + (end-start) / 2;

        int ans = -1;
        while (start <= end){
            int square = mid*mid;
            if(square == n){
                return mid;
            }
            if(square < n){
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            mid = start + (end-start) / 2;
        }
        return ans;
    }
}

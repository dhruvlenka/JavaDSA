package Numbers;

public class PerfectArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1};
        int n = arr.length;
        for(int i=0; i<n; i++){
            if(arr[i] != arr[n-i-1]){
                System.out.println("Not Perfect");
            }
        }
        System.out.println("Perfect");
    }
}
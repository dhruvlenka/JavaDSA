package CollectionFramework.List.Stack;

public class PreviousGreatestElement {
    public static void main(String[] args) {
        int[] arr = {15,10,18,12,4,6,2,8};
        int n = arr.length;
        previousGreatest(arr,n);

        System.out.println();

        int[] arr2 = {20,30,10,5,15};
        int n2 = arr2.length;
        previousGreatest(arr2,n2);
    }

    //Naive Solution Big0(n2)
    public static void previousGreatest(int[]arr, int n){
        for(int i=0; i<n; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] > arr[i]) {
                    System.out.print(arr[j] + " ");
                    break;
                }
                if(j == -1){
                    System.out.println(-1 + " ");
                }
            }
        }
    }
}

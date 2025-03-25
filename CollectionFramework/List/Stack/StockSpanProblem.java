package CollectionFramework.List.Stack;

//Brute Force Approach
public class StockSpanProblem {
    public static void main(String[] args) {
        int[] stocks = {100,80,60,70,60,75,85};
        int n = stocks.length;
        printSpan(stocks,n);

        System.out.println();

        int[] stocks2 = {13,15,12,14,16,8,6,4,10,30};
        printSpan(stocks2, stocks2.length);
    }

    //Time Complexity: BigO(n2)
    public static void printSpan(int arr[], int n){
        for(int i=0; i<n; i++){
            int span = 1;
            for(int j=i-1; j>=0 && arr[j] <= arr[i]; j--)
                span++;
            System.out.print(span+" ");
        }
    }
}

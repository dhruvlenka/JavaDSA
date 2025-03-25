package CollectionFramework.List.Stack;

import java.util.Stack;
public class StockSpanFromStack {
    public static void main(String[] args) {
        int[] stocks = {100, 80, 60, 70, 60, 75, 85};
        int n = stocks.length;
        printSpan(stocks, n);
    }
    public static void printSpan(int[] arr, int n) {
        Stack<Integer> s = new Stack<>();
        s.add(0);
        System.out.print(1 + " ");
        for (int i = 1; i < n; i++) {
            while (s.isEmpty() == false && arr[s.peek()] <= arr[i]) {
                s.pop();
            }

            int span = s.isEmpty() ? i + 1 : i - s.peek();
            System.out.print(span + " ");
            s.push(i);
        }
    }
}

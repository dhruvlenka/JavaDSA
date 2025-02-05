package Searching;

public class BookAllocationProblem {
    public static void main(String[] args) {
        int[] arr = {48,90};
        int n = arr.length;
        System.out.println(n);
        int m = 2;
        /*
        You have to allocate the book 'm' students such that the
        maximum number of pages assigned to a student is minimum.
         */
        int answer = bookAllocationProblem(arr, n, m);
        System.out.println(answer);
    }

    public static int bookAllocationProblem(int[] arr, int n, int m) {
        //Where: n = size of the array, m = total number of students
        int start = 0;
        int sum = 0;

        //finding sum of the elements
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        int end = sum;
        int ans = -1;

        //finding mid
        int mid = start + (end - start) / 2;
        while (start <= end) {
            if (isPossible(arr, n, m, mid)) {
                ans = mid;
                end = mid - 1; //if solution exist
            } else {
                start = mid + 1; //if sol doesn't exist
            }
            mid = start + (end - start) / 2;
        }
        return ans;
    }

    public static boolean isPossible(int[] arr, int n, int m, int mid) {
        int studentCount = 1;
        int pageSum = 0;

        for (int i = 0; i < n; i++) {
            if (pageSum + arr[i] <= mid) {
                pageSum += arr[i];
            } else {
                studentCount++;
                //checking student should not more than no of student
                if (studentCount > m || arr[i] > mid) {
                    return false;
                }
                //   pageSum = 0;
                pageSum = arr[i];
            }
        }
        return true;
    }
}
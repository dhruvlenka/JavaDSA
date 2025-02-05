package Searching;

public class PaintersPartitionProblem {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40};
        int m = 2;
        int result = paintersPartitionProblem(arr,m);
        System.out.println(result);
    }
    public static int paintersPartitionProblem(int[] arr, int m) {
        //Where: n = size of the array, m = total number of students
        int start = 0;
        int sum = 0;

        //finding sum of the elements
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int end = sum;
        int ans = -1;

        //finding mid
        int mid = start + (end - start) / 2;
        while (start <= end) {
            if (isPossible(arr, m, mid)) {
                ans = mid;
                end = mid - 1; //if solution exist
            } else {
                start = mid + 1; //if sol doesn't exist
            }
            mid = start + (end - start) / 2;
        }
        return ans;
    }

    public static boolean isPossible(int[] arr, int m, int mid) {
        int studentCount = 1;
        int pageSum = 0;

        for (int i = 0; i < arr.length; i++) {
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

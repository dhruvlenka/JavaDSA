package Sorting;

import java.util.Scanner;

public class Sorting {
    public static void main(String[] args) {
        int count, temp;

        //taking input for array
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of elements for the array: ");
        count = input.nextInt();

        int[] nums = new int[count];
        System.out.println("Enter array elements: ");
        for(int i=0; i<count; i++){
            nums[i] = input.nextInt();
        }
        input.close();

        for(int i=0; i<count; i++){
            for (int j=i+1; j<count; j++){
                if (nums[i] > nums[j]){
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        System.out.println("Array elements in Ascending Order: ");
        for(int i=0; i<count; i++){
            System.out.println(nums[i] + ", ");
        }
    }
}

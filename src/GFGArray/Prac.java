package GFGArray;


public class Prac {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        int n = arr.length;

        for(int i = n-1; i>=0; i--){
            System.out.println(arr[i]);
        }

        int a = 1;
        int b = 2;
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a: "+ a);
        System.out.println("b: "+ b);

    }
}

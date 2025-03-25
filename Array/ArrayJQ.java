package Array;

public class ArrayJQ {
    public static void main(String[] args) {
        int[] a = {12,18,10,17,15,20};
        //for-each loop or enhanced for loop
        for(int p: a){
            System.out.println(p);
        }

        System.out.println();

        //for-loop
        for(int i=0; i<a.length; i++){
            System.out.println(a[i]);
        }
    }
}

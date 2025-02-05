package ArrayQuestions;

public class PrintAnElement {
    public static void main(String[] args) {
        int[] a = {10,20,30,40,50};
        int n = a.length;
        int key = 4;
        int ans = findElementAtIndex(a,n,key);
        System.out.println(ans);
    }
    public static int findElementAtIndex(int[] a, int n, int key) {
            for(int i=0; i<key+1; i++) {}
                return a[key];
    }
    public static int findElementAtIndex2(int[] a, int n, int key) {
        for(int i=0; i<n; i++){
            for(int j=0; j<key+1;){
                return a[key];
            }
        }
        return -1;
    }
}

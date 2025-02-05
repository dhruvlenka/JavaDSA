package ArrayQuestions;

public class FrequencyOfElements {
    public static void main(String[] args) {
        int[] arr = {12,8,5,12,5,12,10,12,12};
        printFrequecy(arr);
    }
    public static void printFrequecy(int[] a){
        int n = a.length;
        for(int i=0; i<n; i++){
            int count = 1;
            for(int j=i+1; j<n; j++){
                if(a[i] == a[j]){
                    count++;
                    a[j] = a[n-1];
                    n--;
                    j--; //otherwise it will count 12 by two different times
                }
            }
            System.out.println(a[i] + " is " + count + " times.");
        }
    }
}

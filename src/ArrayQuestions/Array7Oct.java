package ArrayQuestions;

public class Array7Oct {
    public static void main(String[] args) {
        int[] arr = {15,10,15,12,15,12,18,10};
        printFrequency(arr);
    }

    public static void printFrequency(int[] a) {
        int max = 0;
        int ele = a[0];

        int[] freq = new int[100];
        for(int i=0; i<a.length; i++){
            freq[a[i]]++;

        }
        for(int i=0; i<freq.length; i++){
            if(freq[i] > 0){
                System.out.println(i + " is " + freq[i] + " times");
            }
        }

        //even time
        for(int i=0; i<freq.length; i++){
            if(freq[i] > 1 && freq[i] % 2 == 0){
                System.out.println("Even = " + i);
            }
        }
        //odd
        for(int i=0; i<freq.length; i++){
            if(freq[i] > 0 && freq[i] % 2 == 1){
                System.out.println("Odd = " + i);
            }
        }
        //max
        for(int i=0; i<freq.length; i++){
            if(freq[i] > max){
                max = freq[i];
                ele = i;
            }
        }
        System.out.println("Element " + ele + " is maximum times: " + max);

    }
}

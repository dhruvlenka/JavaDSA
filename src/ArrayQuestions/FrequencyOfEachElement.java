package ArrayQuestions;

public class FrequencyOfEachElement {
    public static void main(String[] args) {
        int[] arr = {4,5,3,6,4,4,3,5,5,2};
        getFrequency(arr);
    }
    public static void getFrequency(int[] a){
        int[] freq = new int[101];
        for(int i=0; i<a.length; i++){
            freq[a[i]]++;
        }
        for(int i=0; i<freq.length; i++){
            if(freq[i] > 0){
                System.out.println(i + " is " + freq[i] + " times.");
            }
        }
    }
}

package String;

//Coding Ninjas Question
public class StringReverse_CodNinja {
    public static void main(String[] args) {
        char[] arr = {'h','e','l','l','o'};
        System.out.println(stringReverse(arr));
    }
    public static String stringReverse(char[] arr) {
        int i = 0;
        int j  = arr.length-1;
        while (i<j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return new String(arr);
    }
}

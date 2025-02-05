package ArrayQuestions;

public class AddElement {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int[] result = addElement(arr, 3, 90);
        for(int r: result){
            System.out.println(r);
        }
    }
    public static int[] addElement(int[] arr, int index, int value){
        int[] b = new int[arr.length+1];
        for(int i=0; i<b.length; i++){
            if(i<index){
                b[i] = arr[i];
            } else if(i == index){
                b[i] = value;
            } else {
                b[i] = arr[i-1];
            }
        }
        return b;
    }
}

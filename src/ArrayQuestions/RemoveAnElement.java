package ArrayQuestions;

public class RemoveAnElement {
    public static void main(String[] args) {

    }
    public static int[] removeElement(int[] a, int index){
        int[] b = new int[a.length-1];
        for(int i=0; i<b.length; i++){
            if(i<index){
                b[i] = a[i];
            } else {
                b[i] = a[i+1];
            }
        }
        return b;
    }
}

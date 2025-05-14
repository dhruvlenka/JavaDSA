package CoreJava.Loops.WhileLoop;

public class StringReverse {
    public static void main(String[] args) {
        String s = "dhruv";
        String rev = "";
        //reverse from back
        int i=s.length()-1;
        while (i >= 0){
            rev = rev + s.charAt(i);
            i--;
        }
        System.out.println("Reverse is: " + rev);
        System.out.println(stringReverseWay1(s));
        System.out.println(stringReverseWay2(s));
    }
    public static String stringReverseWay1(String str){
        String rev = "";
        int i=str.length()-1;
        while (i >= 0){
            rev = rev + str.charAt(i);
            i--;
        }
        return rev;
    }
    public static String stringReverseWay2(String str) {
        String rev = "";
        int i=0;
        while (i< str.length()){
            rev = str.charAt(i) + rev;
            i++;
        }
        return rev;
    }
}

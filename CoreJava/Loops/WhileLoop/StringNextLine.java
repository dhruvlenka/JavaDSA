package CoreJava.Loops.WhileLoop;

public class StringNextLine {
    public static void main(String[] args) {
        String s = "JQSpiders";
        for (int i=0; i<s.length(); i++){
            System.out.println(s.charAt(i));
        }
        System.out.println();
        printCharacterFromStart(s);

        printCharacterFromStart2(s);

        System.out.println("Reverse Characters ");
        printCharacterFromEnd(s);

    }
    public static void printCharacterFromStart(String s){
        for(int i=0; i<s.length(); i++){
            System.out.println(s.charAt(i));
        }
    }
    public static void printCharacterFromStart2(String s){
        int i=0;
        while (i<s.length()){
            System.out.println(s.charAt(i));
            i++;
        }
    }
    public static void printCharacterFromEnd(String s){
        int i = s.length()-1;
        while (i >= 0){
            System.out.println(s.charAt(i));
            i--;
        }
    }
}

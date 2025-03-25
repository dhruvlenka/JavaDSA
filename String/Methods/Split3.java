package String.Methods;

public class Split3 {
    public static void main(String[] args) {
        String s = "   Mohan       is         here";
        String[] p = s.split("\s+");
        System.out.println(s.trim().split("\s+").length);

        System.out.println();

        int leng = s.trim().split("\s+").length;
        System.out.println("Total Word is: " + leng);
    }
}

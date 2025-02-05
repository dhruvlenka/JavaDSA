package String.Methods;

public class Split10 {
    public static void main(String[] args) {
        String s = "Mo@han!is*he$re";
        String[] p = s.split("[a-zA-Z0-9]");
        System.out.println(p.length);

    }
}

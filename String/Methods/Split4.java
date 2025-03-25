package String.Methods;

public class Split4 {
    public static void main(String[] args) {
        String s = "Mohaaaaaaaaaanaaxyabtcab";
        String[] p = s.split("a");

        System.out.println(p.length);
        for(String ss: p){
            System.out.println(ss);
        }
    }
}

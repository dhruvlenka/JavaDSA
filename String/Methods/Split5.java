package String.Methods;

public class Split5 {
    public static void main(String[] args) {
        String s = "Mo@ha!nis@!he#re";
        String[] p = s.split("[@!*$#]+");
        System.out.println(p.length);
        for(String str: p){
            System.out.println(str);
        }

        String s2= "MohanandsohanandRohanishere";

    }
}
package String.Methods;

public class Split2 {
    public static void main(String[] args) {
        String s = "   Mohan       is         here";
        String[] p = s.split("\s+"); // (\s+): it will remove all the space in one time
        System.out.println(p.length);
        for(String k: p){
            System.out.println(k);
        }
    }
}

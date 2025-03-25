package String.Methods;

//by this it will split whenever an lowercase or uppercase will found
public class Split7 {
    public static void main(String[] args) {
        String s = "mo@h5a!ni123s!@&h3e#re";
        // String[] p = s.split("[0123456789]+");
        String[] p2 = s.split("[a-zA-Z]+");
        System.out.println(p2.length);
        for(String k: p2){
            System.out.println(k);
        }
    }
}

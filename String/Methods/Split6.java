package String.Methods;

//it will split whenever a digit found
public class Split6 {
    public static void main(String[] args) {
        String s = "mo@h5a!ni123s!@&h3e#re";
       // String[] p = s.split("[0123456789]+");
        String[] p2 = s.split("[0-9]+");
        System.out.println(p2.length);
        for(String k: p2){
            System.out.println(k);
        }

    }
}

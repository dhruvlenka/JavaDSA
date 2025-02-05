package String.Methods;

public class Split8 {
    public static void main(String[] args) {
        String s = "moh5ani123sh3ere";
        // String[] p = s.split("[0123456789]+");
        String[] p2 = s.split("[a-zA-Z]+");
        int sum = 0;

        System.out.println(p2.length);
        for(String k: p2){
                        //converting string to integer, we can do as: parseInt, valueOf (wrapper class)
            sum += Integer.parseInt(k);
        }
        System.out.println("Total Sum: " + sum);
    }
}

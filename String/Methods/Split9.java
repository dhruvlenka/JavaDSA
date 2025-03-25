package String.Methods;

//it will split whenever one or more non-numeric character is found
public class Split9 {
    public static void main(String[] args) {
        String s = "0mo9h5ani123sh3ere";
        //^: not
        String[] p = s.split("[^0-9]+");
        int sum=0;
        System.out.println(p.length);
        for(String k: p){
            System.out.println(k);
            sum = sum + Integer.parseInt(k);
        }
        System.out.println("Total Sum: " + sum);
    }
}

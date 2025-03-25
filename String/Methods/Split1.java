package String.Methods;

/*
Split method takes regular expression as a argument and
it's gives the resultant split value in string array form.
*/
public class Split1 {
    public static void main(String[] args) {
        String str = "Mohan is here";
        String str2 = "Mohan   is  here";

        String[] p = str.split(" ");
        String[] p2 = str2.split(" ");

        System.out.println(p.length);
        for(String s: p){
            System.out.println(s);
        }

        System.out.println(p2.length);
        for(String s2: p2){
            System.out.println(s2);
        }


    }
}

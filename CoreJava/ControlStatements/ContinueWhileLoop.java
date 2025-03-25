package CoreJava.ControlStatements;

public class ContinueWhileLoop {
    public static void main(String[] args) {
        int i=2;
        while (i<=100){
            if(i%2 == 0)
            System.out.println("i: "+i);
            i++;
            continue;
        }
        System.out.println("We got Even Numbers");
    }
}

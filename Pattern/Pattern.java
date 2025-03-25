package Pattern;

public class Pattern {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++){
            for(int j=1; j<=5; j++){
                //inner loops: rows: are decided by the conditions of outer loop.
                System.out.print("*");
            }
            //outer loops: columns: are decided by inner loop condition.
            System.out.println();
        }
    }
}

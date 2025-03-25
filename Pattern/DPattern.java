package Pattern;

public class DPattern {
    public static void main(String[] args) {
        int n = 8;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(j==1 || i==1 && j<n|| i==n && j<n|| j==n && i!=1 && i!=n){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();

        }
    }
}

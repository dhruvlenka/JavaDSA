package Pattern;

public class APattern {
    public static void main(String[] args) {
        int n = 10;

        int mid = n/2+1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i==mid || i==mid && j!=mid){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

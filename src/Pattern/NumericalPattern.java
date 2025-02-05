package Pattern;

public class NumericalPattern {
    public static void main(String[] args) {
        int n = 5;

        numbersPattern(n);
        System.out.println();
        numbersPattern2(n);
    }
    public static void numbersPattern(int n){
        int star=1;
        int space = n/2;
        int mid = n/2+1;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=space; j++){
                System.out.print("   ");
            }
            for(int j=1; j<=star; j++){
                System.out.printf("%3d", j);
            }
            if(i<mid){
                star+=2;
                space--;
            } else {
                star-=2;
                space++;
            }
            System.out.println();
        }
    }
    public static void zeroOnePattern(int n){
        int star=1;
        int space = n/2;
        int mid = n/2+1;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=space; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=star; j++){
                System.out.print(j%2 + " ");
            }
            if(i<mid){
                star+=2;
                space--;
            } else {
                star-=2;
                space++;
            }
            System.out.println();
        }
    }
    //1, 234, 56789..... and soon.
    public static void numbersPattern2(int n){
        int star=1;
        int space = n/2;
        int mid = n/2+1;
        int x=1;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=space; j++){
                System.out.print("    ");
            }
            for(int j=1; j<=star; j++){
                System.out.printf("%3d", x);
                x++;
            }
            if(i<mid){
                star+=2;
                space--;
            } else {
                star-=2;
                space++;
            }
            System.out.println();
        }
    }
}

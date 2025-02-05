package Pattern;

public class NumberTriangle {
    public static void main(String[] args) {
        int n = 5;

        System.out.println("Number Increasing Pyramid Pattern");
        numberIncreasingPyramidPattern(n);

        System.out.println("Number Increasing Reverse Pyramid Pattern ");
        numberIncreasingReversePyramidPattern(n);

        System.out.println("Number Right Reverse Pattern");
        numberRightReversePattern(n);

        System.out.println("Number Triangle/Pyramid");
        numberTrianglePyramid(n);

        System.out.println("Number Triangle/Pyramid Pattern Reverse 2");
        numberTriablePyramidReverse2(n);

    }

    //numberLeftPatttern
    public static void numberIncreasingPyramidPattern(int n) {
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }

    // 1, 12, 123, 1234, 12345, 123456 bottom to top
    public static void numberIncreasingReversePyramidPattern(int n){
        int num = n;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=num; j++){ //j<=n-i
                System.out.print(j+ " ");
            }
            num--;
            System.out.println();
        }
    }

    public static void numberRightReversePattern(int n) {
        int num = 1;
        int space = n-1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= num; j++) {
                System.out.print(j + " ");
            }
            num++;
            space--;
            System.out.println();
        }
    }
    public static void numberTrianglePyramid(int n){
        int num=1;
        int space = n-1;
        for(int i=1; i<=n;i++){
            for(int j=1; j<=space; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=num; j++){
                System.out.print(i + " ");
            }
            num+=2;
            space--;
            System.out.println();

        }
    }
    public static void numberTriablePyramidReverse(int n){
        for(int i=1; i<=n; i++){
            //inner loop to print spaces
            for(int j=1; j<=i; j++){
                System.out.print(" ");
            }
            //outer loop to print value of j
            for(int j=i; j<=n; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    public static void numberTriablePyramidReverse2(int n){
        int num = 1;
        int space = n;
        for(int i=n; i>=1; i--){
            //inner loop to print space
            for(int j=i; j<=space; j++) {
                System.out.print("  ");
            }
            //inner loop to print value of i
            for(int j=1; j<=(2*i-1); j++){
                System.out.print(i + " ");
            }
            System.out.println("");
        }
    }

}

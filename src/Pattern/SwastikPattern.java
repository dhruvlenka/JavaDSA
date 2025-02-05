package Pattern;

public class SwastikPattern {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        int n = input.nextInt();

        int n =10;
        swastik(n);

//        int mid = n/2+1;
//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=n; j++){
//                if(i==mid || j==mid || i==1 && j>mid || j==n && i>mid || i==n && j<mid || j==1 && i<mid){
//                    System.out.print("* ");
//                } else {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
 //       }

    }
public static void swastikPattern(int n){
    int mid = n/2+1;
    for(int i=1; i<=n; i++){
        for(int j=1; j<=n; j++){
            if(i==mid || j==mid || i==1 && j>mid || i==n && j<mid || j==1 && i<mid || j==n && i>mid){
                System.out.print("* ");
            } else {
                System.out.print("  ");
            }
        }
        System.out.println();
    }
}
public static void swastik(int n){
        int mid = n/2+1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i==mid || j==mid || i==1 && j>mid || j==1 && i<mid || i==n && j<mid || j==n && i>mid) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
}
}

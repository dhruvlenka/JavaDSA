package Pattern;

import java.util.Scanner;

public class PyramidStar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = input.nextInt();
        pyramidTopToBottom(n);


    }

    public static void rightHalfPyramid(int n){
        int star = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=star; j++){
                System.out.print("* ");
            }
            star++;
            System.out.println();
        }
    }

    public static void leftHalfPyramid(int n){
        int star = 1;
        int space = n-1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=space; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=star; j++){
                System.out.print("* ");
            }
            star++; space--;
            System.out.println();

        }
    }
    public static void reverseLeftHalfPyramid(int n){
        int star = n;
        int space = 0;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=space; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=star; j++){
                System.out.print("*");
            }
            star--; space++;
            System.out.println();

        }
    }
    public static void reverseRightHalfPyramid(int n){
        int star = n;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=star; j++){
                System.out.print("* ");
            }
            star--;
            System.out.println();

        }
    }
    public static void reverseRightHalfPyramid2(int n){
        int star = n;
        int space = 0;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=space; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=star; j++){
                System.out.print("*    ");
            }
            star--;
            space++;
            System.out.println();

        }
    }
    //right pyramid
    public static void rightPyramid(int n) {
        int star = 1;
        int mid = n / 2 + 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= star; j++) {
                System.out.print("*    ");
            }
            if (i < mid) {
                star++;
            } else {
                star--;
            }
            System.out.println();
        }
    }
    public static void pyramidTopToBottom(int n){
        int star=1;
        int space = n-1;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=space; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=star; j++){
                System.out.print("* ");
            }
            star+=2;
            space--;
            System.out.println();
        }
    }
}

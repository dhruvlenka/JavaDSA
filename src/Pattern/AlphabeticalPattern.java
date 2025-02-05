package Pattern;

public class AlphabeticalPattern {
    public static void main(String[] args) {
        int n = 26;
        alphabeticalPattern(n);
        System.out.println("Alpha:2");
        alphabeticalPattern2(n);
        System.out.println("Alpha 3");
        alphabeticalPattern3(n);
    }

    //alphabetical pattern using ASCII Value (int x = 65)
    public static void alphabeticalPattern(int n){
        int star=1;
        int space = n/2;
        int mid = n/2+1;

        int x = 65;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=space; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=star; j++){
                System.out.print((char)x + " ");
                x++;
            }
            if(i<mid){
                star+=2;
                space--;
            } else {
                star-=2;
                space++;
            }
          //  x++; if you use this  will print AAA, BBB, CCCD, DDDDD and soon.
          //  x=65; this will print A, ABC, ABCDE, ABCDEFG and soon
            System.out.println();
        }
    }
    public static void alphabeticalPattern2(int n){
        int star=1;
        int space = n/2;
        int mid = n/2+1;

        char c = 'A';
        for(int i=1; i<=n; i++){
            for(int j=1; j<=space; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=star; j++){
                System.out.print(c + " ");
                c++;
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
    public static void alphabeticalPattern3(int n){
        int star=1;
        int space = n/2;
        int mid = n/2+1;

        char c = 'A';
        for(int i=1; i<=n; i++){
            for(int j=1; j<=space; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=star; j++){
                System.out.print(c  + " ");
                c++;
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

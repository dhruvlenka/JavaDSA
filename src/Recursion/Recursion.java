package Recursion;

class Recursion {
    static int x = 0;
    public static void main(String[] args) {
      test2(1);

    }
    public static void test(){
        x++;
        if(x < 3) {
            System.out.println("x from if is: " + x);
            test();
        }
        //backtrack
        System.out.println("x from else is " + x);
    }
    public static void test2(int n){
        if(n < 3) {
            System.out.println("n from if is: " + n);
            test2(n+1);
        }
        System.out.println("n from else is "+n);
    }
}
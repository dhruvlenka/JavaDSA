import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        int power; int sum=1;
        String s=Integer.toString(num);
        char a[]=s.toCharArray();
        for(int i=1;i<a.length;i++) {
            int dig=Character.getNumericValue(a[i-1]);
            int exp=Character.getNumericValue(a[i]);
            power=(int)(Math.pow(dig,exp));
            sum+=power;
        }
        System.out.println("Sum of power= "+ sum);

    }
}

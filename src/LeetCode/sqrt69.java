//Leetcode: 69
public class sqrt69 {
    public static void main(String[] args) {
        //Simple formula to find sqrt
        double x = Math.sqrt(25);
        System.out.println(x);

        //square function
        int num = 8;
        if(num == 0){
            System.out.println(0);
        }
        if (num == 1){
            System.out.println(1);
        }
        double temp;
        double squareRoot = num/2; // 8/2=4
        do{
            temp = squareRoot; //4
            squareRoot = (temp+(num/temp))/2;
        } while ((temp - squareRoot) != 0);

        int i = (int)squareRoot; //
        System.out.println(i);
    }
}

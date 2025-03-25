package GFGArray;

public class FascinatingNumber {
    public static void main(String[] args) {
        int n = 192;
        boolean ans = fascinating(n);

    }
    public static boolean fascinating(long n) {
        String str = String.valueOf(n);

        long num2 = 2 * n; //multiplying by 2
        long num3 = 3 * n; //multiplying by 3

        //Concatenation
        String concatenatedStr = str + num2 + num3;
        if(isNumber1To9Present(concatenatedStr)){
            return true;
        } else {
            return false;
        }

    }

    private static boolean isNumber1To9Present(String str){
        if(str.length() != 9){
            return false;
        }
        for(char digit = '1'; digit <= '9'; digit++){
            if(str.indexOf(digit) == -1){
                return false; //digit not found
            }
        }
        return true;
    }
}

import java.util.HashMap;
import java.util.Scanner;
public class IntegerToRoman {
    private static int[] values = {1000, 900, 500, 400, 100, 90,50, 40, 10, 9, 5, 4, 3, 2, 1};
    private static HashMap<Integer,String> map = new HashMap<>();

    private static void hashValues(){
        map.put(1,"I");
        map.put(2, "II");
        map.put(3, "III");
        map.put(4, "IV");
        map.put(5, "V");
        map.put(9, "IX");
        map.put(10, "X");
        map.put(40, "XL");
        map.put(50, "L");
        map.put(90, "XC");
        map.put(100, "C");
        map.put(400, "CD");
        map.put(500, "D");
        map.put(900, "CM");
        map.put(1000,"M");
    }

     public String intToRoman(int num) {
      hashValues();
      String result = new String();
      for(int i: values){
          while (num >= i){
              result += map.get(i);
              num -= i;
          }
      }
         return result;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to convert in Roman = ");
        int num = input.nextInt();
        IntegerToRoman intRom = new IntegerToRoman();
        int value = num;
        String str = intRom.intToRoman(value);
        System.out.println(str);

    }
}

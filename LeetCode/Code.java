import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Code {
    public static void main(String[] args) {
        int[] alicesSize = {1,1}; //size = 2
        int[] bobSize = {2,2}; //size = 4

        System.out.println(Arrays.toString(fairCandySwap(alicesSize,bobSize)));

    }
    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        Set<Integer> candy = new HashSet<>();
        int[] res = new int[2];
        int aliceSum = 0;
        int bobSum = 0;
        for (int a: aliceSizes){
            aliceSum += a;
        }
        for(int b: bobSizes){
            bobSum += b;
            candy.add(b);
        }
        int difference = (bobSum - aliceSum) / 2;
        for(int c: aliceSizes){
            if(candy.contains(c + difference)){
                res[0] = c;
                res[1] = c + difference;
                break;
            }
        }
        return res;
    }
}

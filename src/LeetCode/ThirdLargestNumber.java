public class ThirdLargestNumber {
    public static void main(String[] args) {
        int[] thirdLargest = {45,18,24};
        Integer firstMax = null;
        Integer secondMax = null;
        Integer thirdMax = null;
        //enhanced for loop
        for (Integer num: thirdLargest){
            // (||)does not check second condition if first condition is true.
//            if (num.equals(firstMax)|| num.equals(secondMax) || num.equals(thirdMax)){
//                continue;
//            }
            if (firstMax == null || num > firstMax){
//                thirdMax = secondMax;
//                secondMax = firstMax;
                firstMax = num;
            } else if (secondMax == null || num > secondMax) {
                thirdMax = secondMax;
                secondMax = num;
            } else if (thirdMax == null || num > thirdMax) {
                thirdMax = num;
            }
        }

        if (thirdMax == null){
            System.out.println(firstMax);
        }
        System.out.println("Third maximum number is " + thirdMax);
    }
}

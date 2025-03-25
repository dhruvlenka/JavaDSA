package OOPS.Typecasting;

public class NarrowingOrExplicitConversion {
    public static void main(String[] args) {
        //narrowing conversion or explicit conversion
        //larger to smaller data type using type-casting

        double doubleNum = 123.456;
        float floatNum = (float) doubleNum; //dounle to float
        long longNum = (long) floatNum; //float to long
        int intNum  = (int) longNum; //long to int
        short shortNum = (short) intNum; //int to short
        byte byteNum = (byte) shortNum; //short to byte

        System.out.println("Narrowing or explicit type conversion.");
        System.out.println("double to float: " + floatNum);
        System.out.println("float to long: " + longNum);
        System.out.println("long to int: " + intNum);
        System.out.println("int to short: " + shortNum);
        System.out.println("short to byte: " + byteNum);


    }
}

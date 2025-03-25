package OOPS.Typecasting;

public class WideningOrImplicitConversion {
    public static void main(String[] args) {
        //widening conversion or implicit conversion
        //smaller to larger datat type
        byte byteValue = 10;
        short shortValue = byteValue; //byte to short
        int intValue = shortValue; // short to int
        long longValue = intValue; // int to long
        float floatValue = longValue; //long to float
        double doubleValue = floatValue; //float to double

        System.out.println("Widening Conversion: ");
        System.out.println("Byte Value: " + byteValue);
        System.out.println("Short Value: " + shortValue);
        System.out.println("Int Value: " + intValue);
        System.out.println("Long Value: " + longValue);
        System.out.println("Float Value " + floatValue);
    }
}

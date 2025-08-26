package CoreJava.Operators.Questions;

public class TempratureConverterCToF {
    public static void main(String[] args) {
        int celsius = 37;
        int fahrenheit = (int)(celsius * 1.8) + 32; //typecast
        System.out.println(fahrenheit);

    }
}

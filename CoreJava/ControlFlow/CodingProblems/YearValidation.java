package CoreJava.ControlFlow.CodingProblems;

public class YearValidation {
    public static void main(String[] args) {
        int year = 1899;
        if(year >= 1900 && year <= 2025){
            System.out.println("Year validated.");
        } else {
            System.out.println("Not Validated.");
        }
    }
}

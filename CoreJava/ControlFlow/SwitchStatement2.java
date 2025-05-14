package CoreJava.ControlFlow;

public class SwitchStatement2 {
    public static void main(String[] args) {
        String months = "May";

        String result = switch (months) {
            case "Jan", "Feb", "Mar", "Apr", "May" -> "It is a month of Spring or early Summer.";
            case "Jun", "Jul", "Aug" -> "It is a Summer month.";
            case "Sep", "Oct", "Nov" -> "It is a Fall/Autumn month.";
            case "Dec" -> "It is December, a Winter month.";
            default -> "Invalid month.";
        };

        System.out.println(result);

    }
}

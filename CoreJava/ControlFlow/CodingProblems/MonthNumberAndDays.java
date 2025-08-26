package CoreJava.ControlFlow.CodingProblems;

public class MonthNumberAndDays {
    public static void main(String[] args) {
        int monthNumber = 6;
        switch (monthNumber){
            case 1,3,5,7,8,10,12:
                System.out.println("31 Days");
                break;
            case 2:
                System.out.println("28 Days");
                break;
            case 4,6,9,11:
                System.out.println("30 Days");
                break;
            default:
                System.out.println("Wrong Month");
        }
    }
}

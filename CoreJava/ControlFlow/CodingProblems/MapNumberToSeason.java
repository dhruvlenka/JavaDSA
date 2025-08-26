package CoreJava.ControlFlow.CodingProblems;

public class MapNumberToSeason {
    public static void main(String[] args) {
        int num = 2;
        switch (num){
            case 12, 1,2:
                System.out.println("Winter");
                break;
            case 3,4,5:
                System.out.println("Spring");
                break;
            case 6,7,8:
                System.out.println("Summer");
                break;
            case 9,10,11:
                System.out.println("Autumn");
            default:
                System.out.println("fgsga");
        }
    }
}

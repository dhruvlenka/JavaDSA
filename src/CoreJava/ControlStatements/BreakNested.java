package CoreJava.ControlStatements;

public class BreakNested {
    public static void main(String[] args) {
        for(int i=1; i<5; i++){
            for(int j=2; j<10; i++){
                if(j==5){
                    break;
                }
                System.out.println(j);
                j++;
            }

        }
    }
}

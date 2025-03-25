package CodingNinjas;

public class CountOfPlates {
    public static void main(String[] args) {
        int noOfPlate = 4;
        int radiusOfTable = 10;
        int radiusOfPlate = 4;

        if(radiusOfPlate <= radiusOfTable){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        if(countOfPlates(noOfPlate,radiusOfTable,radiusOfPlate)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
    static boolean countOfPlates(int n, int R, int r){
        if(n==1 && r<=R || n==2 && r*2<=R || Math.asin((double) r / (R-r)) * n <= Math.PI){
            return true;
        } else{
            return false;
        }
    }
}

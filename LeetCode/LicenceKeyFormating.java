import java.util.Scanner;

public class LicenceKeyFormating {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Licence Key = ");
        String str = input.nextLine();

        str = str.toUpperCase(); //converting into upperCase letter
        str = str.replaceAll("-", ""); //replaceAll
        int k = input.nextInt(); //k = target

        StringBuilder strBuil = new StringBuilder(str);
        for (int i = str.length()-k; i>0; i=i-k){
            strBuil.insert(i, "-");
        }
        System.out.println(strBuil);
    }
}

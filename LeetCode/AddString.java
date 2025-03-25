public class AddString {
    public static void main(String[] args) {
        String num1 = "123";
        String num2 = "456";
        int n = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);
        int sum = n+n2;
        String s = Integer.toString(sum);
        System.out.println(s);
    }
}

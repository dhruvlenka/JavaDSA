public class ThousandSeparator {
    public static void main(String[] args) {
        int n = 1281;
        String s = String.format("%,d", n);
        String newString = s.replace(',','.');
        System.out.println(newString);
    }
}
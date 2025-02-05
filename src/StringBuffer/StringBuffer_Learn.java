package StringBuffer;

public class StringBuffer_Learn {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello ");
        System.out.println(sb);

        System.out.println(sb.length());
        System.out.println(sb.append("Dhruv "));
        System.out.println(sb.append("Lenka"));

        System.out.println(sb.charAt(0));
        System.out.println(sb.reverse());
    }
}

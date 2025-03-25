public class SegmentInAString {
    public static void main(String[]args) {
    String s = " Hello, My name is dhruv ";
    System.out.println("Before removing spaces = " + s);
    System.out.println("After removing spaces = " + s.trim());
    if (s.trim().equals("")){
        System.out.println(0);
    }
        System.out.println("Number of Segment in this string is = " + s.trim().split("\\s+").length);
    }
}
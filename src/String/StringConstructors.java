package String;

public class StringConstructors {
    public static void main(String[] args) {

        //Empty String: String s = new String();

        //String initialized by an array of characters
        char[] chars = {'m','a','c'};
        String s2 = new String(chars);
        System.out.println(s2);

        //Subrange of characters
        char[] chars2 = {'m','a','c','b','o','o','k','p','r','o'};
        String s3 = new String(chars2,3,7);
        System.out.println(s3);

        /*
        You can construct a String object that contains the same character
        sequence as another String object using the constructor.
          String(String strObj)
          Here, strObj is a string obejct.
         */

        //Construct one string from another
        char[] c = {'J','a','v','a'};
        String str1 = new String(c);
        String str2 = new String(str1);

        System.out.println(str1);
        System.out.println(str2);

        //Construct string from subset of char array
        byte[] ascii = {68,69,70,71,72,73,74,75};
        String chArr = new String(ascii);
        System.out.println(chArr);

        String chArr2 = new String(ascii,3,4);
        System.out.println(chArr2);

        /*
        You can construct a String from a StringBuffer by using the constructor
        : String(StringBuffer strBufObj
        You can construct a String from a StringBuilder by using this constructor
        : String(StringBuilder strBuildObj
         */

    }
}

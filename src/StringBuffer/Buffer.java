package StringBuffer;

public class Buffer {
    public static void main(String[] args) {
        System.out.println("StringBuffer");

        //StringBuffer length() vs capacity()
        StringBuffer lenCap = new StringBuffer("Bruce");

        System.out.println("buffer = " + lenCap);
        System.out.println("length = " + lenCap.length());
        System.out.println("capacity = "+ lenCap.capacity());
        System.out.println();

        /*
        Here when you run this program, it will show how
        StringBuffer reserves extra space for additional
        manipulations:

        Output:
        Wayne
        5
        21
        Since lenCap is initialized with the String "Wayne"
        when it is creates, it's length is 5 and in the new line
        it's capacity is 21 because room for 16 additional
        characters is automatically added.
         */

        //IndexOf()
        /*
        This method is used for finding the first index of the given
        String in the sequence of the StringBuffer.If the String is not
        present in the sequence of the StringBuffer this method will return -1.
        */
        StringBuffer dexOf = new StringBuffer("MI Light");
        System.out.println(dexOf.indexOf("M"));
        System.out.println(dexOf.indexOf("I"));
        System.out.println();

        //lastIndexof()
        /*
        This method is used to find the last index of the particular StringBuffer sequence.
         */
        StringBuffer ltIndex = new StringBuffer("MacbookPro M1");
        System.out.println(ltIndex.lastIndexOf("M1"));
        System.out.println();

        //charAt() and setCharAt()
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println("buffer before = " + sb);
        System.out.println("charAt (1) before = " + sb.charAt(1) );

        sb.setCharAt(1,'i');
        sb.setLength(2);
        System.out.println("buffer after = " + sb);
        System.out.println("charAt (1) after = " + sb.charAt(1));
        System.out.println();

        //deleteCharAt()
        StringBuffer delChar = new StringBuffer("Practice");
        //deleting the character at index 3
        delChar.deleteCharAt(3);
        System.out.println(delChar);
        System.out.println();

        //getChars()

        //append
        String s;
        int a = 22;
        StringBuffer age = new StringBuffer(40);
        s = age.append("Dhruv age is:  ").append(a).append("!").toString();
        System.out.println(s);
        System.out.println();

        //toString();

        StringBuffer tostr = new StringBuffer();
        tostr.append(45);
        System.out.println(tostr.toString());

        //Insert
        StringBuffer ins = new StringBuffer("Mr");
        ins.insert(2," Bruce Wayne");
        System.out.println("After Insert: " + ins);
        System.out.println();

        //reverse()
        //This method is used for reversing the StringBuffer sequence.
        StringBuffer rev = new StringBuffer("TENET");
        rev.reverse();
        System.out.println(rev);

        //delete() and deleteCharAt()
        StringBuffer del = new StringBuffer("Learning StringBuffer");
        del.delete(8,15);
        System.out.println("After delete: " + del);

        del.deleteCharAt(0);
        System.out.println("Aftet deleteCharAt: " + del);
        System.out.println();

        //replace()
        StringBuffer repl = new StringBuffer("Jack Ryan");
        repl.replace(5,9,"Sparrow");
        System.out.println("After replace: " + repl);
        System.out.println();

        //substring()
        //This method is used for getting the substring from the StringBuffer sequence.
        StringBuffer m = new StringBuffer("LNCT University");
        System.out.println(m.substring(4));
        //endIndex-1
        System.out.println(m.substring(4,8));
        System.out.println();
    }
}

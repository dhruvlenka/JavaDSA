package String;

public class StringMethod {
    public static void main(String[] args) {
        //indexOf() Method
        String str = "You are masterpiece";
        System.out.println("Index of character m = " + str.indexOf("are"));
        System.out.println();

        //indexOf() with only one parameter
        String str2 = "Learn Java";
        System.out.println("Getting index of character 'J' = "+str2.indexOf('J')); //6
        System.out.println("First occurrence of 'a' is returned = "+str2.indexOf('a')); //2
        System.out.println("Character is not present in the string 'j' = "+str2.indexOf('j')); //-1
        System.out.println("Getting the index of ava = "+str2.indexOf("ava")); //7
        System.out.println("Word java is not present in the string  = "+str2.indexOf("java")); //-1
        System.out.println("Index of empty string in the string is = " + str.indexOf(""));
        System.out.println();

        //indexOf() with fromIndex Parameter
        String str3 = "Learn Java Programming";
        System.out.println(str3.indexOf('a',4)); //7
        System.out.println(str3.indexOf("Java",8)); //-1
        System.out.println();

        //LastIndexOf

        //charAt Method
        String charIndexValue = "dhruv";
        System.out.println(charIndexValue.charAt(4));
        System.out.println();

        //Length Method
        String s = "Hello";
        System.out.println("Length of s = " + s.length());

        //String is the number of characters
        char[] dhruvChar = {'d','h','r','u','v'};
        String namePrint = new String(dhruvChar);
        System.out.println(namePrint.length());
        System.out.println();

        //String compareTo
        String compare = "HELLO";
        String compare2 = "dhruv";
        String compare3 = "HII";
        String compare4 = "HOLA";
        String compare5 = "hello";
        System.out.println(compare.compareTo(compare2));
        System.out.println(compare.compareTo(compare3));
        System.out.println(compare.compareTo(compare4));
        if (compare == compare2){
            System.out.println(true);
        }
        System.out.println(false);

        //String compareToIgnoreCase
        System.out.println(compare.compareToIgnoreCase(compare5)); //give 0 because its equal to the string
        System.out.println(compare.compareToIgnoreCase(compare2)); //give 4 because its greater than the string
        System.out.println();

        //Concat
        String course = "Coding";
        System.out.println(course.concat(" Ninjas"));
        System.out.println();

        //String Concatenation
        String age = "22";
        String hisage = "He is " + age +" years old";
        System.out.println(hisage);

        //String Concatenation
        String longLines = "Java is a high-level " +
                "platform-independent programming language," +
                "and also a secure language because " +
                "whenever you write a program in Java" +
                "firstly it compile into bytecode and " +
                "then it runs on Java-Virtual-Machine.";
        System.out.println(longLines);
        System.out.println();

        //String concatenation with other dataTypes
        int age2 = 22;
        String dhruvAge = "He is " + age2 + " years old.";
        System.out.println(dhruvAge);
        System.out.println();

        //Wrong string concatenation
        String wrong = "four: "+2+2+"not 4";
        System.out.println(wrong);
        System.out.println();


        //String replaceAll
        String replace = "Jack Reacher";
        System.out.println(replace.replaceAll("Jack Reacher", "Jack Sparrow")); // Jack Sparrow
        System.out.println(replace.replaceAll("J", "K"));

        //String replaceFirst
        String firstReplace = "Vikas Lenka";
        System.out.println(firstReplace.replaceFirst("Vikas","")); //Dhruv Lenka

        //String UpperCase
        String wayneSons = "mr wayne";
        System.out.println(wayneSons.toUpperCase());

        //String LowerCase
        String name = "TOM CRUISE";
        System.out.println(name.toLowerCase()); //tom cruise
        System.out.println();

        //String starsWith()
        String matrix = "Neo, Mr Anderson";
        System.out.println(matrix.startsWith("Neo"));
        System.out.println(); //true

        //String endsWith
        String ryan = "Jack Ryan, The Analyst";
        System.out.println(ryan.endsWith("Analyst"));

        //Contain
        String bond = "007 James Bond";
        String stark  = "Tony Stark";
        String wayne = "Bruce Wayne";
        System.out.println(bond.contains("007")); //true
        System.out.println(stark.contains("Harvard"));//false because there is no Harvard in stark var.
        System.out.println(wayne.contains("Bruce"));//true
        //Using if else
        if (bond.contains("007")){
            System.out.println("Yes, it's contains.");
        } else {
            System.out.println("Sorry it's not contains.");
        }


        //split
        System.out.println("Split ============== ");
        String intro = "Hi,I am dhruv12345@@";
        String[] words = intro.split("\\s");
        for(String w: words){
            System.out.println(w);
        }
        //String[] split(String regex,int limit)
        String[]words2 = intro.split("\\s", 2);
        for(String w2: words2){
            System.out.println(w2);
        }
        System.out.println();

        //trim()
        String character = " Lu cifer";
        System.out.println(character + "MorningStar "); //without trim
        System.out.println(character.trim()+ "MorningStar"); //with trim
        System.out.println();

        //boolean equals
        String mac1 = "MacbookPro M1 16GB 2021";
        String mac2 = "MacbookPro M2 16GB 2023";
        String mac3 = "Macbook Air M1";
        String mac4 = "Macbook Air M2";
        String mac5 = "MacbookPro M1 16GB 2021";
        System.out.println(mac1.equals(mac2)); //false
        System.out.println(mac1.equals(mac3)); //false
        System.out.println(mac1.equals(mac4)); //false
        System.out.println(mac1.equals(mac5)); //true
        System.out.println();

        //boolean equalsIgnoreCase
        String iPhone = "IPHONE12";
        String iPhone2 = "iphone12";
        System.out.println(iPhone.equalsIgnoreCase(iPhone2)); //true
        System.out.println();

        //boolean isEmpty() or isBlank()
        String empty = "";
        System.out.println(empty.isEmpty()); //true
        System.out.println(empty.isBlank()); //true
        System.out.println();

        String notEmpty = "hi";
        System.out.println(notEmpty.isEmpty()); //false
        System.out.println(notEmpty.isBlank()); //false
        System.out.println();

        //getBytes()
        String bytes = "ABCDabcd";
        byte[] br = bytes.getBytes();
        for(byte b: br){
            System.out.println(b);
        }
        System.out.println();

        //valueOf()
        int i = 100;
        char c = 'D';
        float f = 68.5f;
        long l = 4500000L;
        double d = 4.5555555d;

        //converting above data type values to String
        String dataTypeInt = String.valueOf(i);
        String dataTypeChar = String.valueOf(c);
        String dataTypeFloat = String.valueOf(f);
        String dataTypeLong = String.valueOf(l);
        String dataTypeDouble = String.valueOf(d);

        System.out.println(dataTypeInt);
        System.out.println(dataTypeChar);
        System.out.println(dataTypeFloat);
        System.out.println(dataTypeLong);
        System.out.println(dataTypeDouble);

        //equals() Versus ==
        String versus1 = "Hello";
        String versus2 = new String(versus1);

        System.out.println(versus1 + " equals "  + versus2 + " -> " + versus1.equals(versus2));
        System.out.println(versus1 + " == " + versus2 + " -> " + (versus1 == versus2));
        System.out.println();

        //getChars
        String getChar = "This is a demo of the getChars method";
        int start = 10;
        int end = 14;
        char[] buf = new char[end-start];
        getChar.getChars(start,end,buf,0);
        System.out.println(buf);
        System.out.println();

        //Joining Strings
        String result = String.join("","Alpha ","Beta"," Gamma");
        System.out.println(result);
        result = String.join("","Dhruv, ","ID: 51", " Email: lenkadhruv@gmail.com");
        System.out.println(result);
        System.out.println();

        // String To toCharArray() method example
        String toChar = "leetcode";
        char[] ch = toChar.toCharArray();
        for (char value : ch) {
            //System.out.println(temp); //will give ascii value
            System.out.println(value);
        }

        //Example 2
        String toChar2 = "Doing my best";
        char[] ch2 = toChar2.toCharArray();
        int len = ch2.length;
        System.out.println("Char length = " + len);
        System.out.println("Char array elements = ");
        for (char value2: ch2){
            System.out.println(value2);
        }
        //Modifying a String
        //substring()
        String org = "This is a test. This is, .";  //original
        String search = "is"; //searching word
        String sub = "was"; //substring
        String res = " "; //result
        int ss;
        do { //replacing aa matching substring
            System.out.println(org);
            i = org.indexOf(search);
            if (i != -1){
                res = org.substring(0,i);
                res = res + sub;
                res = res + org.substring(i + search.length());
                org = res;
            }
        } while(i != -1);

        //substring example: 2
        String STR = "Macbook Pro";
        String subSTR = STR.substring(3,11);
        System.out.println(subSTR);
    }
}

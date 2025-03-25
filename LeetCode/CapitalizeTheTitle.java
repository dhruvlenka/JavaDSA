//LeetCode: 2120
public class CapitalizeTheTitle {
    public static void main(String[] args) {
        String title = "you ar a fool";

        //spliting the string
        String[] split = title.split(" ");
        for(String str: split){
            System.out.println(str);
        }
        System.out.println();

        //Solving using String Builder
        StringBuilder builder = new StringBuilder();
//        for (String s: split){
//            if (s.length() > 2){
//                builder.append(Character.toUpperCase(s.charAt(0))).append(s.substring(1).toLowerCase());
//            } else {
//                builder.append(s.toLowerCase());
//            }
//            builder.append(" ");
//        }
//        builder.setLength(builder.length()-1);
//        System.out.println(builder.toString());

        for (String st: split){
            if (st.length() == 1 || st.length() == 2){
                builder.append(st.toLowerCase());
            } else {
                builder.append(Character.toUpperCase(st.charAt(0)));
                //substring
                builder.append(st.substring(1).toLowerCase());
                System.out.println(builder);
            }
            builder.append(" ");
        }
        System.out.println(builder);
    }
}

package StringBuilder;

import com.sun.security.jgss.GSSUtil;

public class StringBuilder_Learn {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("DhruvMenka");
        System.out.println(sb);

        //charAt
        System.out.println(sb.charAt(0));

        //set char at index
        sb.setCharAt(5, 'L');
        System.out.println(sb);

        //insert
        sb.insert(0, 'V');
        System.out.println(sb);

        //deleting
        sb.delete(2, 3);
        System.out.println(sb);

        System.out.println(sb.length());
    }
}

public class DecryptStringfromAlphabet {
    public static void main(String[] args) {
        String s = "10#11#12";

        String[] nums = s.split("#");
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        for (String str : nums) {
            int num = Integer.parseInt(str);
            // convert the number to a character based on the ASCII value
            if(num <= 26) {
                char c = (char) (num + 96);
                sb.append(c);
            } else {
                int a = (num / 26) - 1;
                int b = num % 26;
                if(b == 0) {
                    sb.append((char)(a + 96));
                    sb.append('z');
                } else {
                    sb.append((char)(a + 96));
                    sb.append((char)(b + 96));
                }
            }
        }

        String output = sb.toString();
        System.out.println(output); // jkab


    }
}

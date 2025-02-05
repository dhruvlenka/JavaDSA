public class GoalParser {
    public static void main(String[] args) {
        String command = "G()(al)";
        String temp = "";
        String ans = "";
        for (int i=0;i<command.length();i++){
            temp = temp + command.charAt(i);
         //   System.out.println(temp);
            if (temp.equals("()")){
                ans = ans + "o";
                temp = "";
            }else if (temp.equals("(al")){
                ans = ans + "al";
                temp = "";
            }else if (temp.equals("G")){
                ans = ans + "G";
                temp = "";
            }
        }
        System.out.println(ans);

        /*
        Using String Builder
          StringBuilder ans = new StringBuilder();
        for (int i=0; i<command.length(); i++){
            temp = temp + command.charAt(i);
          //  System.out.println(temp);
            if (temp.equals("()")){
                ans.append("o");
                temp = "";
            }else if (temp.equals("(al")){
                ans.append("al");
                temp = "";
            } else if (temp.equals("G")){
                ans.append("G");
                temp = "";
            }
        }
        System.out.println(ans);
         */
    }
}

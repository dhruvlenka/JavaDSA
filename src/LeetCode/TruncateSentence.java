public class TruncateSentence {
    public static void main(String[] args) {
        String s = "Hello how are you Contestant";
        String[] truncate = s.split(" "); //splitting the string as array of string
        int target = 4;
        String ans = "";

        //first way
        for (int i=0;i<target;i++){
            ans = ans + truncate[i] + " ";
        }
        System.out.println(ans.trim());

        //second way
//       for(int i=0;i<target;i++){
//           ans = ans + " " + truncate[i];
//       }
//        System.out.println(ans.substring(1));


       //Using String Builder
        StringBuilder truncateSen = new StringBuilder();
        for(int i=0;i<target;i++){
            truncateSen.append(truncate[i]).append(" ");
        }
        //removing last whitespace because we don't need it
        truncateSen.setLength(truncateSen.length() -1);
        System.out.println(truncateSen);

    }
}

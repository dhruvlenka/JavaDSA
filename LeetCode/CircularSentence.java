public class CircularSentence {
    public static void main(String[] args) {
        String s = "eetcode";
//        char[] ch = s.toCharArray();
//        if (ch[0] == 'e'){
//            System.out.println(true);
//        }else {
//            System.out.println(false);
//        }
//        //Array.Array and split
//        for(int i=0;i<s.length();i++){
//            if(s.charAt(i) == ' '){
//                if(s.charAt(i-1) != s.charAt(i+1)){
//                    System.out.println(false);
//                }
//            }
//        }
//        System.out.println(s.charAt(0) == s.charAt(s.length()-1));

        String[] words = s.split(" ");
        int num = words.length;
        if(num == 0)
            System.out.println(true);
        int firstLast = words[num - 1].charAt(words[num - 1].length() - 1);
        for(int i = 0; i < num; i++) {
            if(words[i].charAt(0) != firstLast)
                System.out.println(false);
            firstLast = words[i].charAt(words[i].length() - 1);
        }
        System.out.println(true);
    }
}

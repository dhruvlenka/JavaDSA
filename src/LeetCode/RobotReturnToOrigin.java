public class RobotReturnToOrigin {
    public static void main(String[] args) {
        String moves = "UD";
        int start = 0, end = 0;
        for (int i=0; i<moves.length(); i++){
            if (moves.charAt(i) == 'L') start++;
            if (moves.charAt(i) == 'R') start--;
            if (moves.charAt(i) == 'U') end++;
            if (moves.charAt(i) == 'D') end--;

        }
        if (start == 0 && end == 0){
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        //second way to firstly change string into characters it is faster than earlier program
        for (char c: moves.toCharArray()){
            if (c == 'L') start++;
            if (c == 'R') start--;
            if (c == 'U') end++;
            if (c == 'D') end--;
        }
        System.out.println(start==0 && end ==0);
         //in one line: return x == 0 && y == 0;

    }
}

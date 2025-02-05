package ArrayQuestions;

public class StringLength {
    public static void main(String[] args) {
        String[] str = {"Thor", "IronMan", "Hulk", "Captain America", "Natasha"};
        for(int i=0; i<str.length; i++){
            System.out.println(str[i].length());
        }
    }
    public static void lengthofString(String[] str){
        for (String s : str) {
            System.out.println(s.length());
        }
    }
}

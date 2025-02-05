package ArrayQuestions;

public class StringEvenLength {
    public static void main(String[] args) {
        String[] str = {"Thor", "IronMan", "Hulk", "Captain America", "Natashaa"};
        int count = 0;
        for(int i=0; i<str.length; i++){
           if(str[i].length() % 2 == 0){
               count++;
               System.out.println(str[i] + " String Size = " + str[i].length());
           }
        }
        System.out.println("Total Even Length of Strings" + count);
    }
}

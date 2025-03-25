public class ExcelSheet {
    public static void main(String[] args) {
        String columnTitle = "AD";
        int count = 0;
        for(int i=0; i < columnTitle.length(); i++){
            count = count * 26;
            count = count + (columnTitle.charAt(i)- 'A'+1);
        }
        System.out.println(count);

//        char z = 'Z';
//        int value = 'Z' -'A'+ 1; //int value = 'Z'+ 1; for ASCII
//        System.out.println(value);
    }
}

public class MaxStringArray {
    public static void main(String[] args) {
        //String Array.Array
        String[] strs = {"alic3","bob","3","4","00000"};

        int max=Integer.MIN_VALUE; //-2147483648
        //for loop
        for(int i=0;i<strs.length;i++){
            if(strs[i].matches("[0-9]+")==true){
                if(Integer.parseInt(strs[i])>max)
                    max=Integer.parseInt(strs[i]);
            }
            else{
                if(strs[i].length()>max)
                    max=strs[i].length();
            }

        }
        System.out.println(max);
    }
}

package OOPS;

public class Quiz {
    public static void main(String[] args) {
        int x = "Mary".compareTo("Molly");
        if (x>=0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

        System.out.println(4^12);

       String s = "ABCDEFHHINVABJSB";
       int len = s.length();
        System.out.println(len);

        System.out.println(10<<2);

        boolean[] array = {true,false,true,true};
        for(int i=0; i<array.length; i++){
            System.out.println(!array[i] + ", ");
        }

        int age = 20;
        do {
            age++;
        }while (age < 20);
            System.out.println(age);

    }
}

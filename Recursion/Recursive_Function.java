package Recursion;

public class Recursive_Function {
    //Recursive Function
    static void print(int num){
        if(num == 10){ //function to break this program to save from: StackOverflowError or we can say: Base Condition
            System.out.println(10);
            return; //in base condition, return is mandatory
        }
        System.out.println(num);
        print(num+1);
    }
    public static void main(String[] args) {
        print(2);
    }
}

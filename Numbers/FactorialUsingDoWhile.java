package Numbers;

public class FactorialUsingDoWhile {
    public static void main (String[] args)
    {
        // your code goes here
        int n = 5;
        int fact = 1;
        int i=1;

        do{
            fact = fact * i;
            i++;
        } while(i <= n);
        System.out.println(fact);
    }
}

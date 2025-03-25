package Recursion;

public class Recursion_Steps {
   static void reachHome(int source, int destination){
       System.out.println("Source " + source + "reached to destination" + destination);
        //base case
        if(source == destination){
            System.out.println("You reached Home.");
            return;
        }

        //recursive call
        source++;
        reachHome(source, destination);
    }
    public static void main(String[] args) {
        int source = 1;
        int destination = 10;

        reachHome(source, destination);

    }
}

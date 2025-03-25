package Recursion;

import java.util.ArrayList;
import java.util.Collections;

public class Recursion_RATINAMAZE {
    public static Boolean isSafe(int x, int y, int n, ArrayList<ArrayList<Integer>> visited, ArrayList<ArrayList<Integer>> m){
         return (x >= 0 && x < n) && (y >= 0 && y < n) && (visited.get(x).get(y) == 0) && (m.get(x).get(y) == 1);
    }

    public static void solve(ArrayList<ArrayList<Integer>> m, int n, ArrayList<String> ans,
                        int x, int y, ArrayList<ArrayList<Integer>> visited, String path){

        //base case
        if(x == n-1 && y == n-1){
            ans.add(path);
            return;
        }
        //Markit the current cell is visited
        visited.get(x).set(y,1);

        //4Choices: D,L,R,U
        //down
        int newx = x+1;
        int newy = y;
        if(isSafe(newx, newy, n, visited, m)){
            solve(m,n,ans,newx,newy,visited, path + 'D');
        }

        //left
        newx = x;
        newy = y-1;
        if(isSafe(newx, newy, n, visited, m)){
            solve(m,n,ans,newx,newy,visited,path + 'L');

        }

        //right
        newx = x;
        newy = y+1;
        if(isSafe(newx, newy, n, visited, m)){
            solve(m,n,ans,newx,newy,visited,path + 'R');
        }
        //up
        newx = x-1;
        newy = y;
        if(isSafe(newx, newy, n, visited, m)){
            solve(m,n,ans,newx,newy,visited,path + 'U');

        }
        //Marking the current cell as unvisited
        visited.get(x).set(y,0);
    }
    public static ArrayList<String> findPath(int[][] m, int n) {
        // Your code here
        ArrayList<String> ans = new ArrayList<>();
        //base condition
        if(m[0][0] == 0){
            return ans;
        }

        //converting the 2D array (int[][] m) into arrayList
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        //iterating over each array (row) in the 2D array
        for (int[] row : m) {
            //this list will hold the integers from the current row of the 2D array.
            ArrayList<Integer> list = new ArrayList<>();
            //iterate over each int value (val) in the current row of the 2D array.
            for (int val : row) {
                list.add(val);
            }
            matrix.add(list);
        }

        ArrayList<ArrayList<Integer>> visited = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                list.add(0);
            }
            visited.add(list);
        }
        String path = "";
        solve(matrix, n, ans, 0, 0, visited, path);
        Collections.sort(ans); // Sort the paths lexicographically
        return ans;

    }

    public static void main(String[] args) {

    }

}

package Graph;

import java.util.ArrayList;

public class SrcToDest {
    static class EDGE {
        int source; //source
        int destination; //destination

        public EDGE(int src, int dest){
            this.source = src;
            this.destination = dest;

        }
        public static void dfs(ArrayList<EDGE> graph[], int curr, boolean[] vis){
            System.out.println(curr + " ");
            vis[curr] = true;
            //finding neighbours
            for(EDGE e: graph[curr]){
                if(!vis[e.destination]){
                    dfs(graph, e.destination, vis);
                }
            }
        }
        //Time Complexity: O(V^V)
        //Path: for printing all the possible paths
        //curr: on which node we are at currently
        public static void printAllPath(ArrayList<EDGE> graph[], boolean[] vis, int curr, String path, int target){
            //base case
            if(curr == target){
                System.out.println(path);
                return;
            }

            for(int i=0; i<graph[curr].size(); i++){
                //finding neighbours
                EDGE e = graph[curr].get(i);
                if(!vis[e.destination]){
                    vis[curr] = true;

                    //curr: e.destination
                    //adding destination in the path
                    printAllPath(graph, vis, e.destination, path+e.destination, target);
                    /*
                    vis[curr] = false
                    because we are marking visited to all the nodes
                    when we came back to the nodes then the we also
                    marks false so we will got the all possible path,
                    we are doing this because we want all the paths
                    may be we need the nodes multiples times.
                     */
                    vis[curr] = false;

                }

            }
        }
    public static void main(String[] args) {
        int V = 7;
        int src = 0;
        int target = 5;
        ArrayList<EDGE>[] graph = new ArrayList[V];
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }
        boolean visited[] = new boolean[V];

        graph[0].add(new EDGE(0, 1));
        graph[0].add(new EDGE(0, 2));

        graph[1].add(new EDGE(1, 0));
        graph[1].add(new EDGE(1, 3));

        graph[2].add(new EDGE(2, 0));
        graph[2].add(new EDGE(2, 4));

        graph[3].add(new EDGE(3, 1));
        graph[3].add(new EDGE(3, 4));
        graph[3].add(new EDGE(3, 5));

        graph[4].add(new EDGE(4, 2));
        graph[4].add(new EDGE(4, 3));
        graph[4].add(new EDGE(4, 5));

        graph[5].add(new EDGE(5, 3));
        graph[5].add(new EDGE(5, 4));
        graph[5].add(new EDGE(5, 6));

        graph[5].add(new EDGE(6, 5));

        printAllPath(graph, new boolean[V], src, "0", target);

    }
    }
}

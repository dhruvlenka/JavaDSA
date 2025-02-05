package Graph;

import java.util.ArrayList;

public class DFS {
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
            /*
            for(int i=0; i<graph[curr].size(); i++){
                EDGE e = graph[curr].get(i);
                if(vis[e.destination] == false) {
                    dfs(graph, e.destination, vis);
                }
            }
             */
        }
    public static void main(String[] args) {
        int V = 7;
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

        for(int i=0; i<V; i++){
            if(visited[i] == false){
                dfs(graph, i, visited);
            }
        }
        System.out.println();
    }
    }
}

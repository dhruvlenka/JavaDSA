package Graph;

import java.util.ArrayList;

public class CycleDetection {
    static class EDGE {
        int source;
        int destination;

        public EDGE(int src, int dest){
            this.source = src;
            this.destination = dest;
        }
    }
    public static boolean isCycleDirected(ArrayList<EDGE> graph[], boolean vis[], int curr, boolean rec[]){
        vis[curr] = true;
        rec[curr] = true;
        for(int i=0; i<graph[curr].size(); i++){
            EDGE e = graph[curr].get(i);
            if(rec[e.destination]){
                return true;
            } else if(!vis[e.destination]){
                //if the neighbour is unvisited, and we called them, if the cycle exist (neighbours) then cycle will exist
                if(isCycleDirected(graph, vis, e.destination, rec)){
                    return true;
                }
            }
        }
        //removing current node from the recursion stack
        rec[curr] = false;
        return false;
    }

    public static void main(String[] args) {
        int vertex = 4;
        ArrayList<EDGE> graph[] = new ArrayList[vertex];
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        boolean vis[] = new boolean[vertex];
        boolean rec[] = new boolean[vertex];

        graph[0].add(new EDGE(0, 2));
        graph[1].add(new EDGE(1, 0));
        graph[2].add(new EDGE(2, 3));
        graph[3].add(new EDGE(3, 0));
        System.out.println(isCycleDirected(graph, new boolean[vertex], 0, new boolean[vertex]));

        //additional: connected components
        for(int i=0; i<vertex; i++){
            if(!vis[i]) {
                boolean isCycle = isCycleDirected(graph, vis, 0, rec);
                if(isCycle){
                    System.out.println(isCycle);
                    break;
                }
            }
        }
    }
}

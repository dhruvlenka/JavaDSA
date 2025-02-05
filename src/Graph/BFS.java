package Graph;

import java.util.*;

//Breadth First Search
public class BFS {
    static class EDGE {
        private final int source; //source
        private final int destination; //destination

        public EDGE(int src, int dest){
            this.source = src;
            this.destination = dest;

        }
        public static void bfs(ArrayList<EDGE> graph[], int V){
            //1: Creating Queue
            Queue<Integer> queue = new LinkedList<>();
            //2: Creating Visited as per vertex
            boolean visited[] = new boolean[V];
            //adding starting point
            queue.add(0);

                  //queue is not empty
            while (!queue.isEmpty()){
                int curr = queue.remove();
                if(visited[curr] == false){
                    System.out.printf(curr + " "); //step 1
                    visited[curr] = true; //step 2

                    //step3: adding neighbours of current: same as adjacency list
                                //size of neighbours list
                    for(int i=0; i<graph[curr].size(); i++){
                        //finding neighbours
                        EDGE e = graph[curr].get(i);
                        //adding neighbours into the queue
                        queue.add(e.destination);
                    }
                }
            }
        }
    public static void main(String[] args) {
            int V = 7;
        ArrayList<EDGE> graph[] = new ArrayList[V];
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }
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
        bfs(graph, V);
        System.out.println();
    }
}
}

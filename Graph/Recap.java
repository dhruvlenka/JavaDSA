package Graph;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Recap {
    static class EDGE {
        int source;
        int destination;

        EDGE(int src, int dest){
            this.source = src;
            this.destination = dest;
        }
    }
    public static void bfs(ArrayList<EDGE> graph[], int vetex){
        Queue<Integer> queue = new LinkedList<>();
        boolean visited[] = new boolean[vetex];
        queue.add(0);

        while (!queue.isEmpty()){
            int curr = queue.remove();
            if(visited[curr] == false){
                System.out.println(curr + " ");
                visited[curr] = true;

                //printing the neighbours of current
                for(int i=0; i<graph[curr].size() ; i++){
                    EDGE e = graph[curr].get(i);
                    queue.add(e.destination);
                }
            }
        }
    }
    public static void main(String[] args) {
        int vertex = 7;
        ArrayList<EDGE> graph[] = new ArrayList[vertex];
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new EDGE(0,1));
        graph[0].add(new EDGE(0,2));

        graph[1].add(new EDGE(1,0));
        graph[1].add(new EDGE(1,3));

        graph[2].add(new EDGE(2,0));
        graph[2].add(new EDGE(2,4));

        graph[3].add(new EDGE(3,1));
        graph[3].add(new EDGE(3,4));
        graph[3].add(new EDGE(3,5));

        graph[4].add(new EDGE(4,2));
        graph[4].add(new EDGE(4,3));
        graph[4].add(new EDGE(4,5));

        graph[5].add(new EDGE(5,3));
        graph[5].add(new EDGE(5,4));
        graph[5].add(new EDGE(5,6));
        graph[5].add(new EDGE(6,5));
        bfs(graph, vertex);
        System.out.println();
    }
}

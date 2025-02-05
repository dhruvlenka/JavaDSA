package Graph;

import java.util.ArrayList;

//third way of implementation and also using weight2
public class Graph3 {
    static class edge {
        int src; //source
        int dest; //destination
        int wt; //weight

        public edge(int src, int dest, int wt){
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }
    public static void createGraph(ArrayList<edge> graph[]){
        //for loop: save us from the null pointer exception
        for(int i=0; i<graph.length; i++){
            //creating a arraylist on each index
            graph[i] = new ArrayList<edge>();
        }
            //adding edge one by one firstly adding 0
            graph[0].add(new edge(0,2,2));
            graph[1].add(new edge(1,2,10));
            graph[1].add(new edge(1,3,0));
            graph[2].add(new edge(2,0,2));
            graph[2].add(new edge(2,1,10));
            graph[2].add(new edge(2,3,-1));
            graph[3].add(new edge(3,1,0));
            graph[3].add(new edge(3,2,-1));

    }
    public static void main(String[] args) {
        int vertex = 4;
        //graph: array, arraylist: edge
        ArrayList<edge> graph[] = new ArrayList[vertex];
        createGraph(graph);

        //printing 2's neighbours
        for(int i=0; i<graph[2].size(); i++){
            edge e = graph[2].get(i);
            System.out.println(e.dest+ " " + e.wt + "  ");
        }
    }
}

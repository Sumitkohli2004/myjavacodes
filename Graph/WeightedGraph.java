package Graph;

import java.util.ArrayList;

public class WeightedGraph {

    public static class Edge {
        int src;
        int dest;
        int weight;

        public Edge(int s, int d , int w) {
            this.src = s;
            this.dest = d;
            this.weight = w;
        }

    }


    public static void createGraph( ArrayList<Edge> graph[]){  // time complexity = O(v+e);
        for(int i=0;i<graph.length;i++){
            graph[i]  = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0,2,3));

        graph[1].add(new Edge(1, 2,5));
        graph[1].add(new Edge(1,3,6));

        graph[2].add(new Edge(2, 0,1));
        graph[2].add(new Edge(2, 1,7));
        graph[2].add(new Edge(2, 3,2));

        graph[3].add(new Edge(3, 1,9));
        graph[3].add(new Edge(3, 2,8));

    }
    public static void main(String[] args) {
       int v = 4;
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);

        for(int i=0;i<graph[2].size();i++){
            Edge e = graph[2].get(i);
            System.out.println(e.dest+", "+e.weight);
    }
        
    }
    
}

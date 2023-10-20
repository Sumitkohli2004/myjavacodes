package Graph;

import java.util.*;

public class unWeightedGraph {

    public static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }

    }

    public static void createGraph( ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]  = new ArrayList<Edge>();
        }

        graph[0].add(null);
        

        graph[1].add(new Edge(1, 2));
        graph[1].add(new Edge(1,11));

        graph[2].add(new Edge(2, 1));
        
        graph[3].add(new Edge(3, 8));
        graph[3].add(new Edge(3, 9));
        
        graph[4].add(new Edge(4, 8));

        graph[5].add(new Edge(5, 7));
        graph[5].add(new Edge(5, 10));

        graph[6].add(new Edge(6, 11));

        graph[7].add(new Edge(7, 11));
        graph[7].add(new Edge(7, 5));

        graph[8].add(new Edge(8, 4));
        graph[8].add(new Edge(8, 3));

        graph[9].add(new Edge(9, 3));

        graph[10].add(new Edge(10, 5));
        graph[10].add(new Edge(10, 11));

        graph[11].add(new Edge(11, 1));
        graph[11].add(new Edge(11, 5));
        graph[11].add(new Edge(11, 7));
        graph[11].add(new Edge(11, 10));
       
    }

    public static void BFS(ArrayList<Edge> graph[] , int v){  // time complexity = O(v+e);
        Queue<Integer> q = new LinkedList<>();
        boolean visited [] = new boolean[v];
        q.add(1);

        while(!q.isEmpty()){
            int temp = q.poll();
            if(visited[temp]==false){
                System.out.print(temp+" ");
                visited[temp] = true;

                for(int i=0;i<graph[temp].size();i++){
                    Edge e = graph[temp].get(i);
                    q.add(e.dest); 
                }
            }
        }
    }


    public static void main(String[] args) {
        int v = 12;
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);
        BFS(graph, v);
        System.out.println();

        // print 2's neighbours

        // for(int i=0;i<graph[2].size();i++){
        //         Edge e = graph[2].get(i);
        //         System.out.print(e.dest+" ");
        // }
    }

}

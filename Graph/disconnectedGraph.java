package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class disconnectedGraph {

    public static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }

    }

    public static void createGraph(ArrayList<Edge> graph[]) { // time complexity = O(v+e);
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        // graph[0].add(null);
    

        graph[1].add(new Edge(1, 2));
        graph[1].add(new Edge(1, 11));

        graph[2].add(new Edge(2, 1));
        
        graph[11].add(new Edge(11, 7));
        graph[11].add(new Edge(11, 6));

        graph[4].add(new Edge(4, 8));
          
        graph[8].add(new Edge(8, 4));
        graph[8].add(new Edge(8, 3));

        graph[3].add(new Edge(3, 8));
        graph[3].add(new Edge(3, 9));

        graph[10].add(new Edge(10, 5));

        

    }

    public static void BFS(ArrayList<Edge> graph[], int v, boolean visited[], int start) {
        Queue<Integer> q = new LinkedList<>();

        q.add(start);

        while (!q.isEmpty()) {
            int temp = q.poll();
            if (visited[temp] == false) {
                System.out.print(temp + " ");
                visited[temp] = true;

                for (int i = 0; i < graph[temp].size(); i++) {
                    Edge e = graph[temp].get(i);
                    q.add(e.dest);
                }
            }
        }
    }

    // public static void DFS(ArrayList<Edge> graph[], int temp, boolean visited[]) {
    //     System.out.print(temp + " ");
    //     visited[temp] = true;

    //     for (int i = 0; i < graph[temp].size(); i++) {
    //         Edge e = graph[temp].get(i);
    //         if (visited[e.dest] == false)
    //             DFS(graph, e.dest, visited);
    //     }

    // }

    // modified DFS code     complexity = O(v^v);

    public static void PrintAllPath(ArrayList<Edge> graph[], boolean visited[], int temp, String path, int tar) {
        if (temp == tar) {
            System.out.println(path);
            return;
        }

        for (int i = 0; i < graph[temp].size(); i++) {
            Edge e = graph[temp].get(i);
            if (!visited[e.dest]) {
                visited[temp] = true;
                PrintAllPath(graph, visited, e.dest, path + e.dest, tar);
                visited[temp] = false;
            }
        }
    }

    public static void main(String[] args) {
        int v = 12;
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);

        boolean visited[] = new boolean[v];
        // for(int i=-0;i<v;i++){
        // if(visited[i]==false){
        // BFS(graph, v , visited,i);
        // }
        // }
        // System.out.println();

        // DFS(graph, 0, visited);
        // System.out.println();

        int src = 0, tar = 5;
        PrintAllPath(graph,new boolean[v],src, "0",tar);

    }

}

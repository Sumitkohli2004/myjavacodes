package Graph;

import java.util.*;

public class BFS {
    static List<List<Integer>> adj_List = new ArrayList<>();

    public static void createAdjList() {
        List<Integer> l = new ArrayList<>();
        l.add(null);
        adj_List.add(l);

        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(2);
        l1.add(11);
        adj_List.add(l1);

        List<Integer> l2 = new ArrayList<>();
        l2.add(1);
        adj_List.add(l2);

        List<Integer> l3 = new ArrayList<>();
        l3.add(8);
        l3.add(9);
        adj_List.add(l3);

        List<Integer> l4 = new ArrayList<>();
        l4.add(8);
        adj_List.add(l4);

        List<Integer> l5 = new ArrayList<>();
        l5.add(10);
        adj_List.add(l5);

        List<Integer> l6 = new ArrayList<>();
        l6.add(11);
        adj_List.add(l6);

        List<Integer> l7 = new ArrayList<>();
        l7.add(11);
        adj_List.add(l7);

        List<Integer> l8 = new ArrayList<>();
        l8.add(3);
        l8.add(4);
        adj_List.add(l8);

        List<Integer> l9 = new ArrayList<>();
        l9.add(3);
        adj_List.add(l9);

        List<Integer> l10 = new ArrayList<>();
        l10.add(5);
        adj_List.add(l10);

        List<Integer> l11 = new ArrayList<>();
        l11.add(1);
        l11.add(6);
        l11.add(7);
        adj_List.add(l11);

    }

    public static void BFS(int start) {
        boolean visited[] = new boolean[adj_List.size()];

        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        visited[start] = true;

        while (!q.isEmpty()) {
            int temp = q.poll();
            for (int i : adj_List.get(temp)) {
                if (!visited[i]) {
                    q.add(i);

                 visited[i] = true;

                }
            }
            System.out.print(temp + "  ");

        }

    }

    public static void main(String[] args) {
        createAdjList();
        System.out.println(adj_List);

        BFS(11);
    }

}
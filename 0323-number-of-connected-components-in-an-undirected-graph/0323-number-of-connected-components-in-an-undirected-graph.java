import java.util.*;

class Solution {
    public int countComponents(int n, int[][] edges) {
        Map<Integer, List<Integer>> adjList = new HashMap<>();
        for (int[] edge : edges) {
            adjList.putIfAbsent(edge[0], new ArrayList<>());
            adjList.putIfAbsent(edge[1], new ArrayList<>());
            adjList.get(edge[0]).add(edge[1]);
            adjList.get(edge[1]).add(edge[0]);
        }

        boolean[] visited = new boolean[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(adjList, i, visited);
                count++;
            }
        }
        return count;
    }

    private void dfs(Map<Integer, List<Integer>> adjList, int node, boolean[] visited) {
        visited[node] = true;
        if (adjList.containsKey(node)) {
            for (int neighbor : adjList.get(node)) {
                if (!visited[neighbor]) {
                    dfs(adjList, neighbor, visited);
                }
            }
        }
    }
}

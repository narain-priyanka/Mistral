class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        int target = graph.length - 1; // Subtract 1 to get the index of the last node
        List<List<Integer>> listpaths = new ArrayList<>();
        int start = 0;
        // Call the backtrack function for each possible path
        List<Integer> currentPath = new ArrayList<>();
        backtrack(graph, start, target, currentPath, listpaths);

        // Print the generated paths
        for (List<Integer> path : listpaths) {
            System.out.println(path);
        }
        return listpaths; // Return the final list of paths
    }

    public static void backtrack(int[][] graph, int currentNode, int target, List<Integer> currentPath, List<List<Integer>> listPaths) {
        // Add the current node to the current path
        currentPath.add(currentNode);

        // If the target node is reached, add the current path to the list of all paths
        if (currentNode == target) {
            listPaths.add(new ArrayList<>(currentPath));
        } else {
            // Continue exploring neighbors
            for (int neighbor : graph[currentNode]) {
                backtrack(graph, neighbor, target, currentPath, listPaths);
            }
        }

        // Backtrack by removing the current node from the path
        currentPath.remove(currentPath.size() - 1);
    }
}

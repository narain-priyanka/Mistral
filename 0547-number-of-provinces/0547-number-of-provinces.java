class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n= isConnected.length;
        int count =0;
        int start= 0;
        boolean[] visited = new boolean[n];
        return traversed(isConnected,n,visited,start,count);
    }
    public static int traversed( int[][] adjmatrix, int n,boolean[] visited, int start, int count){
        for(int i=0;i<n;i++){
            if(visited[i]==false){
                ffa(adjmatrix,n,i,count,visited);
                count++;
            }
        }
        return count;
    }
    public static void ffa(int[][] adjmatrix, int n, int start, int count, boolean[] visited) {
        Stack<Integer> s = new Stack<>();
        s.push(start);
        while (!s.isEmpty()) {
            int currentNode = s.pop();
            for (int nextNode = 0; nextNode < n; nextNode++) {
                if (adjmatrix[currentNode][nextNode] == 1 && !visited[nextNode]) {
                    s.push(nextNode);
                    visited[nextNode] = true;
                }
            }
        }
    }
}
class Solution {
    private void dfs(int node, boolean[] visited, int[][] edges){
        visited[node] = true;
        for(int i = 0; i < edges[node].length; i++){
            if(!visited[i] && edges[node][i] == 1){
                dfs(i, visited, edges);
            }
        } 
    }
    public int findCircleNum(int[][] isConnected) {
        int N = isConnected.length;
        boolean[] visited = new boolean[N];
        int provinces = 0;

        for(int i =0; i<N; i++){
            if(!visited[i]){
                dfs(i, visited, isConnected);
                provinces++;
            }
        }

        return provinces;
    }
}
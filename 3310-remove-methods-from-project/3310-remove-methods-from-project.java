class Solution {
    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {
        //building graph
        List<List<Integer>>graph=new ArrayList<>();
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }
        for(int[]edge:invocations){
            graph.get(edge[0]).add(edge[1]);
        }

        //finding all suspicious methods in this graph
        boolean[]suspicious=new boolean[n];
        dfs(k,graph,suspicious);

        //check karenge ke yaha pe non-suspicious method calls karte hai kya suspicious methods ko
        for(int[]edge:invocations){
            int u=edge[0];
            int v=edge[1];
            if(!suspicious[u]&&suspicious[v]){
                return getAllMethods(n);
            }
        }
        // yaha pe return karenge only non-suspicious methods ko
        List<Integer>ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(!suspicious[i]) ans.add(i);
        }     
        return ans;
    }
    private void dfs(int node,List<List<Integer>> graph,boolean[]suspicious){
        suspicious[node] =true;
          for (int next : graph.get(node)) {
            if (!suspicious[next]) {
                dfs(next, graph, suspicious);
            }
        }
    }
    private List<Integer> getAllMethods(int n) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ans.add(i);
        }
        return ans;
    }
}
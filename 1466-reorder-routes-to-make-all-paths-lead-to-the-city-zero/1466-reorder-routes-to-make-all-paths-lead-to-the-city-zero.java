class Solution {
//     XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
    int count=0;
    // dfs traversal 
    public void dfs( List<List<int[]>> graph, int vtx, boolean [] visited){
         List<int[]> list = graph.get(vtx);
         for(int [] pair : list) {
             if(visited[pair[0]]== false) {
                 visited[pair[0]] = true;
                 // during dfs if we get the pair direction as 1 then it was original edge pointing away from 0
                 // hence we increase the count as we would need to reverse it to reach 0 node
                 if(pair[1] == 1) count++;
                 dfs(graph, pair[0], visited);
             }
         }
    }
    public int minReorder(int n, int[][] edges) {
        // the graph which is provided is directed in different dirn's so we cannot reach all nodes if we start 
        // traversing the graph from zero node.
        // to overcome this we make the graph directed in both ways , and new directed edge made by us will be marked
        // by some value like 0(false), so that we know that this is not the actual directed edge but made by us
        
        List<List<int[]>> graph= new ArrayList<>();
        
        for(int i=0;i<n;i++) graph.add(new ArrayList<>());
    
        for(int i=0;i<edges.length;i++) {
            int edge[] =  edges[i];
            // we add 1 in pair which represents that the edge actually exists 
            graph.get(edge[0]).add(new int[]{edge[1],1});
            // we add 0 in pair which represents that the edge actually does not exist and we have created it 
            graph.get(edge[1]).add(new int[]{edge[0],0});
        }
        
        // we will apply dfs 
        boolean [] visited = new  boolean[n];
        visited[0] = true;
        dfs(graph, 0, visited);
            
        return count;
           
    }
}
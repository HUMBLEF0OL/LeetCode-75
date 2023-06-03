class Solution {
    public void findAllConnectedNodes(int [][]isConnected,int currentNode,boolean []visited){
        // mark the currentNode as visited
        visited[currentNode] = true;
        
        // now explore all the connected nodes
        for(int j = 0;j<isConnected[currentNode].length;j++){
            // check if the searchedNode is not visited and is connected to currentNode
            if(isConnected[currentNode][j] == 1 && !visited[j]){
                findAllConnectedNodes(isConnected,j,visited);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        // maintain a visited array
        boolean visited[] = new boolean[isConnected.length];
        int province = 0;
        // iterate over all the nodes
        for(int i =0;i<visited.length;i++){
            // if current node is not visited then explore it
            if(!visited[i]){
                findAllConnectedNodes(isConnected,i,visited);
                // for this node we have discovered all the connected nodes
                province++;
            }
        }
        return province;
    }
}